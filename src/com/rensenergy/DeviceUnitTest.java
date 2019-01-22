package com.rensenergy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DeviceUnitTest {
	private BufferedReader buf;
	private String type;
	private String abbr;
	private String name;
	private String unit;
	private String avg;
	private String sum;
	private String acc;
	public void DeviceUnitInitializer() {
		List<DeviceUnitTest> deviceUnitList = new ArrayList<DeviceUnitTest>();
		try {
			File file = new File("C:/protice/Test.txt");
			InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
			buf = new BufferedReader(isr);
			String str = null;

			while ((str = buf.readLine()) != null) {
				// skip comments
				if (str.startsWith("#")) {
					continue;
				}
				String[] data = str.split("\t");
				if (data.length != 6) {
					for (String d : data) {
						// Logger.info(d);
					}
					System.out.println("33333333");
					continue;
				}
				DeviceUnitTest unit = new DeviceUnitTest();
				unit.type = data[0].trim();
				unit.name = data[1].trim();
				unit.abbr = data[2].trim();
				if (data[3].trim().length() != 0) {
					unit.unit = data[3].trim();
				}
				if (data[4].trim().length() != 0) {
					unit.avg = data[4].trim();
				}
				if (data[5].trim().length() != 0) {
					unit.sum = data[5].trim();
				}
				if (data[6].trim().length() != 0) {
					unit.acc = data[6].trim();
				}
				deviceUnitList.add(unit);
				System.out.println("获得unit");
			}

			/*
			 * deviceUnitList.sort((DeviceUnit a, DeviceUnit
			 * b)->a.abbr.compareTo(b.abbr));
			 * 
			 * Ebean.saveAll(deviceUnitList); Logger.info(
			 * "create device unit successfully."); Ebean.commitTransaction();
			 */
		} catch (Throwable e) {
			e.printStackTrace();
			// Logger.error("fail to create device unit.");
		} finally {
			if (buf != null) {
				try {
					buf.close();
				} catch (Throwable e) {

				}
			}
			// Ebean.endTransaction();
		}
	}

	private String getFileName(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args){
		System.out.println("11111");
		DeviceUnitTest dyt =new DeviceUnitTest();
		dyt.DeviceUnitInitializer();
	}
 }