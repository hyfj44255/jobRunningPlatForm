package com.ibm.sc.skittles.sshFileTransfer;

public class SFTPUtil {
	public static void main(String[] args) {
		try {
			jjj();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void jjj() throws Exception {
		int i = 1;
		int o = i++;
		int p = --i;
		if (1 == 1) {
			throw new RuntimeException("121212");
		}
		o = p;
		p = --i + p;
	}
	/*
	 * public static void main(String[] args) { String host = "127.0.0.1"; int port
	 * = 22; String username = "root"; String password = "root"; ChannelSftp sftp =
	 * null; Session session = null; String destDir = "/opt/yangtest/common1.rar";
	 * File srcfile = new File("C:\\Users\\IBM_ADMIN\\Desktop"); try { session =
	 * SFTPUtil.connect(host, port, username, password); Channel channel =
	 * session.openChannel("sftp"); channel.connect(); sftp = (ChannelSftp) channel;
	 * // SFTPUtil.upload(destDir, srcfile.getAbsolutePath(), sftp);
	 * SFTPUtil.download("C:\\Users\\IBM_ADMIN\\Desktop", destDir,
	 * "C:\\Users\\IBM_ADMIN\\Desktop\\testing.rar", sftp); } catch (Exception e) {
	 * e.printStackTrace(); } finally { if (sftp != null) sftp.disconnect(); if
	 * (session != null) session.disconnect(); } }
	 * 
	 * private void file2Ftp() {
	 * 
	 * }
	 *//**
		 * 连接sftp服务器
		 * 
		 * @param host
		 *            远程主机ip地址
		 * @param port
		 *            sftp连接端口，null 时为默认端口
		 * @param user
		 *            用户名
		 * @param password
		 *            密码
		 * @return
		 * @throws JSchException
		 */
	/*
	 * public static Session connect(String host, Integer port, String user, String
	 * password) throws JSchException { Session session = null; try { JSch jsch =
	 * new JSch(); if (port != null) { session = jsch.getSession(user, host,
	 * port.intValue()); } else { session = jsch.getSession(user, host); }
	 * session.setPassword(password); // 设置第一次登陆的时候提示，可选值:(ask | yes | no)
	 * session.setConfig("StrictHostKeyChecking", "no"); // 30秒连接超时
	 * session.connect(30000); } catch (JSchException e) { e.printStackTrace();
	 * System.out.println("SFTPUitl 获取连接发生错误"); throw e; } return session; }
	 * 
	 *//**
		 * sftp上传文件(夹)
		 * 
		 * @param directory
		 * @param uploadFile
		 * @param sftp
		 * @throws Exception
		 */
	/*
	 * public static void upload(String directory, String uploadFile, ChannelSftp
	 * sftp) throws Exception { System.out.println("sftp upload file [directory] : "
	 * + directory); System.out.println("sftp upload file [uploadFile] : " +
	 * uploadFile); File file = new File(uploadFile); if (file.exists()) { //
	 * 这里有点投机取巧，因为ChannelSftp无法去判读远程linux主机的文件路径,无奈之举 try { Vector content =
	 * sftp.ls(directory); if (content == null) { sftp.mkdir(directory); } } catch
	 * (SftpException e) { sftp.mkdir(directory); } // 进入目标路径 sftp.cd(directory); if
	 * (file.isFile()) { InputStream ins = new FileInputStream(file); // 中文名称的
	 * sftp.put(ins, new String(file.getName().getBytes(), "UTF-8")); //
	 * sftp.setFilenameEncoding("UTF-8"); } else { File[] files = file.listFiles();
	 * for (File file2 : files) { String dir = file2.getAbsolutePath(); if
	 * (file2.isDirectory()) { String str =
	 * dir.substring(dir.lastIndexOf(file2.separator)); directory = "";//
	 * FileUtil.normalize(directory + str); } upload(directory, dir, sftp); } } } }
	 * 
	 *//**
		 * sftp下载文件（夹）
		 * 
		 * @param directory
		 *            下载文件上级目录
		 * @param srcFile
		 *            下载文件完全路径
		 * @param saveFile
		 *            保存文件路径
		 * @param sftp
		 *            ChannelSftp
		 * @throws UnsupportedEncodingException
		 */
	/*
	 * public static void download(String directory, String srcFile, String
	 * saveFile, ChannelSftp sftp) throws UnsupportedEncodingException { Vector
	 * conts = null; try { conts = sftp.ls(srcFile); } catch (SftpException e) {
	 * e.printStackTrace(); } File file = new File(saveFile); if (!file.exists())
	 * file.mkdir(); // 文件 if (srcFile.indexOf(".") > -1) { try { sftp.get(srcFile,
	 * saveFile); } catch (SftpException e) { e.printStackTrace(); } } else { //
	 * 文件夹(路径) for (Iterator iterator = conts.iterator(); iterator.hasNext();) {
	 * LsEntry obj = (LsEntry) iterator.next(); String filename = new
	 * String(obj.getFilename().getBytes(), "UTF-8"); if (!(filename.indexOf(".") >
	 * -1)) { directory = "";// FileUtil.normalize(directory +
	 * System.getProperty("file.separator") + // filename); srcFile = directory;
	 * saveFile = "";// FileUtil.normalize(saveFile +
	 * System.getProperty("file.separator") + // filename); } else { //
	 * 扫描到文件名为".."这样的直接跳过 String[] arrs = filename.split("\\."); if ((arrs.length >
	 * 0) && (arrs[0].length() > 0)) { srcFile = "";// FileUtil.normalize(directory
	 * + System.getProperty("file.separator") + // filename); } else { continue; } }
	 * download(directory, srcFile, saveFile, sftp); } } }
	 */}
