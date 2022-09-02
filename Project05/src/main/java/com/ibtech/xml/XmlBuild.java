package com.ibtech.xml;

import org.w3c.dom.*;
import static com.ibtech.xml.XmlUtilities.*;

public class XmlBuild {
	public static void main(String[] args) throws Exception {

		// JAX-P
		String path = "C:\\Users\\ISMETUNLU\\Desktop\\EE\\Product.xml";
		Document document = parse(path);

		// DOM
		Element product = document.getDocumentElement();
		double id = getAttribute(product, "id", 0);
		System.out.println("Özdeşlik: " + id);

		String name = getSingleElementText(product, "name", "");
		System.out.println("Ad: " + name);
		double price = getSingleElementText(product, "price", 0);
		System.out.println("Ad: " + price);

	}
}
