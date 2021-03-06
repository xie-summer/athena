package com.athena.excore.template.export.supports;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import com.athena.excore.template.export.AbstractProcessValidation;
import com.athena.excore.template.export.IProcessData;
import com.athena.excore.template.export.IZipFileTool;
import com.athena.util.exception.ServiceException;

/**
 * @Author: 王冲
 * @Email:jonw@sina.com
 * @Date: 2012-4-25
 * @Time: 下午4:42:21
 * @Description :代理类
 */
public class ProcessDataStaticProxy extends AbstractProcessValidation implements IProcessData {

	// 文件得理接口
	private IProcessData process = null;
	private String filePrefix = null;
	private String fileSuffix = null;

	/**
	 * @Author: 王冲
	 * @Email:jonw@sina.com
	 * @description 构造
	 * @param filePrefix
	 * @param fileSuffix
	 * @param process
	 */
	private ProcessDataStaticProxy(String _filePrefix, String _fileSuffix,
			IProcessData process) {
		this.filePrefix = _filePrefix;
		this.fileSuffix = _fileSuffix;
		this.process = process;

	}

	/**
	 * @Author: 王冲
	 * @Email:jonw@sina.com
	 * @Date: 2012-4-25
	 * @Time: 下午4:42:21
	 * @param filePrefix
	 *            文件 名后缀
	 * @param fileSuffix
	 *            文件 名前缀
	 */
	public static ProcessDataStaticProxy getInstances(
			String filePrefix, String fileSuffix, IProcessData process) {
		return new ProcessDataStaticProxy(filePrefix, fileSuffix, process);

	}


	public ByteArrayOutputStream processFileStream(String ftlName,
			Map<String, Object> dataSource) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	public byte[] processByteCache(String ftlName,
			Map<String, Object> dataSource) throws ServiceException {
		
		// 得到文件 流
		byte[] bt = this.process.processByteCache(ftlName, dataSource);

		/**将生成的文件 流转换成压缩流**/
		
		// 检查
		checkParam();
		
		IZipFileTool zip = null;
		try {
			// 构建压缩对象
			zip = new DefaultZipFilTool(filePrefix, fileSuffix);
		} catch (UnsupportedEncodingException e) {
			throw new ServiceException(e.getMessage());
		}
		// 2.输入流压缩
		java.io.ByteArrayOutputStream out = null;
		try {
			// 压缩文件
			out = zip.zipFileByte(bt);
		} catch (IOException e) {
			throw new ServiceException(e.getMessage());
		}finally{
			if(out!=null){
				try {
					out.close();
				} catch (IOException e1) {
					throw new ServiceException(e1.getMessage());
				}
			}
		}
		return out.toByteArray();

	}

	

	/**
	 * @Author: 王冲
	 * @Email:jonw@sina.com
	 * @Date: 2012-4-26
	 * @Time: 上午10:29:07
	 * @throws Exception
	 * @Description: 检查文件 的合法性
	 */
	protected void checkParam() throws ServiceException {
		if (this.process == null) {
			throw new ServiceException(" the process is null!");
		}
		if (this.filePrefix == null) {
			throw new ServiceException("filePrefix 文件名前缀不能为空!");
		}
		if (this.fileSuffix == null) {
			throw new ServiceException("fileSuffix 文件名后缀不能为空!");
		}

	}
}
