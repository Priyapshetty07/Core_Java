package com.xworkz.objectmethods.equality;

import com.xworkz.equality.enums.IceCreamFlavour;
import com.xworkz.equality.enums.IceCreamType;

public class IceCream {

	private IceCreamFlavour flavour;
	private String name;
	private IceCreamType type;

	public IceCream() {
		System.out.println("invoked no args const in  IceCream");
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from IceCream");
		if (obj != null) {
			System.out.println("ref is not nulls");
			if (obj instanceof IceCream) {
				System.out.println("refrence is IceCream");
				IceCream casted = (IceCream) obj;
				String castedName = casted.getName();
				IceCreamType castedIceCreamType = casted.getType();

				if (this.name.equals(castedName) && this.type.equals(castedIceCreamType)) {
					System.out.println("Name and Types is matching");
					return true;
				} else {
					System.err.println("Name or Types not is matching");
				}
			} else {
				System.err.println("cannot compare, ref is not a IceCream");
			}
		} else {
			System.err.println("ref is null pass proper ref");
		}
		return false;

	}

	public IceCreamFlavour getFlavour() {
		return flavour;
	}

	public void setFlavour(IceCreamFlavour flavour) {
		this.flavour = flavour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IceCreamType getType() {
		return type;
	}

	public void setType(IceCreamType type) {
		this.type = type;
	}

}
