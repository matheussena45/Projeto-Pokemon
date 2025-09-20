package Principal;

import java.io.*;

public class salvarArquivo {
	public static void escreveObjeto(Object obj, String arq) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(arq);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static Object lerObjeto(String arq) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object retorno = null;
		try {
			fis = new FileInputStream(arq);
			ois = new ObjectInputStream(fis);
			retorno = ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return retorno;
	}
}