package com.jialin.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 获取Android端上传过来的信息
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class UploadAction extends ActionSupport {
	//上传文件存放路径
    private final static String UPLOADDIR = "/upload";
    //上传文件名集合
    private String fileFileName;
    //上传文件内容类型集合
    private List<String> fileContentType;
    // 上传文件域
    private File file;

    @Override
    public String execute() {
    	
    	try {
            InputStream in = new FileInputStream(getFile());
            String dir = mkDir();
            File uploadFile = new File(dir, getFileFileName());
            OutputStream out = new FileOutputStream(uploadFile);
            byte[] buffer = new byte[1024 * 1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
 
            in.close();
            out.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    	
        return SUCCESS;
    }
    
    private String mkDir(){
    	String dir = ServletActionContext.getRequest().getRealPath(UPLOADDIR);
    	File uploadFileDir = new File(dir);
    	if(!uploadFileDir.exists()){
    		uploadFileDir.mkdirs();
    	}
    	return dir;
    }
    
    public File getFile() {
		return file;
	}



	public void setFile(File file) {
		this.file = file;
	}

	

	public String getFileFileName() {
		return fileFileName;
	}



	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}



	public List<String> getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}

	private void close(FileOutputStream fos, FileInputStream fis) {
        if (fis != null) {
            try {
                fis.close();
                fis=null;
            } catch (IOException e) {
                System.out.println("FileInputStream关闭失败");
                e.printStackTrace();
            }
        }
        if (fos != null) {
            try {
                fos.close();
                fis=null;
            } catch (IOException e) {
                System.out.println("FileOutputStream关闭失败");
                e.printStackTrace();
            }
        }
    }

}
