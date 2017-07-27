// { autofold
package com.yourself;

import java.util.HashSet;
import java.util.Set;
//}
class City {
	String name;

	City(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof City && ((City) obj).name == name;
	}

	@Override
	public int hashCode() {
		return (name == null) ? 0 : name.hashCode();
	}
}
//{ autofold
public class EqualsAndHashcode {

	public static void exec() {
//}

City city1 = new City("Paris");
City city2 = new City("Paris");
Set<City> uniqueCities = new HashSet<>();
uniqueCities.add(city1);
uniqueCities.add(city2);

System.out.println(city1.equals(city2)); // if equals is overridden then it return true, false otherwise.
uniqueCities.stream().forEach(System.out::println); // prints one city if hashCode and equals are overridden, two cities otherwise.
//{ autofold
	}
}
// }