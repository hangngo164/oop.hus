package oop.lab07.ex4p3.countryarraymanager;

import java.util.LinkedList;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }
    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public Country[] getCountries() {
        return countries;
    }

    public int getLength() {
        return length;
    }
    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }
    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }
    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        int size = newArray.length;

        for (int i = 0; i < size; i++) {
            int minPopulation = newArray[i].getPopulation();
            int minIdx = i;
            for (int j = i + 1; j < size; j++) {
                int temp = newArray[j].getPopulation();
                if (temp < minPopulation) {
                    minPopulation = temp;
                    minIdx = j;
                }
            }

            Country temp = newArray[minIdx];
            newArray[minIdx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }
    /**
     * Sort the countries in order of decreasing population
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int size = newArray.length;

        for (int i = 0; i < size; i++) {
            int maxPopulation = newArray[i].getPopulation();
            int maxIdx = i;
            for (int j = i + 1; j < size; j++) {
                int temp = newArray[j].getPopulation();
                if (temp > maxPopulation) {
                    maxPopulation = temp;
                    maxIdx = j;
                }
            }

            Country temp = newArray[maxIdx];
            newArray[maxIdx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }
    /**
     * Sort the countries in order of increasing area
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        int size = newArray.length;
        for(int i = 0; i < size - 1; i++) {
            for(int j =0; j < size - i - 1; j++) {
                if(newArray[j].getArea() > newArray[j+1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j+1];
                    newArray[j+1] = temp;
                }
            }
        }
        return newArray;
    }
    /**
     * Sort the countries in order of decreasing area
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea(){
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        int size = newArray.length;
        for(int i = 0; i < size - 1; i++) {
            for(int j =0; j < size - i - 1; j++) {
                if(newArray[j].getArea() < newArray[j+1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j+1];
                    newArray[j+1] = temp;
                }
            }
        }
        return newArray;
    }
    /**
     * Sort the countries in order of increasing GDP
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int size = newArray.length;
        for(int i = 1; i < size; i++) {
            Country temp = newArray[i];
            int j = i -1;
            while(j >=0 && newArray[j].getGdp() > temp.getGdp()) {
                newArray[j+1] = newArray[j];
                j--;
            }
            newArray[j+1] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp(){
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        int size = newArray.length;
        for(int i = 1; i < size; i++) {
            Country temp = newArray[i];
            int j = i -1;
            while(j >=0 && newArray[j].getGdp() < temp.getGdp()) {
                newArray[j+1] = newArray[j];
                j--;
            }
            newArray[j+1] = temp;
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        List<AfricaCountry> newAfricaList = new LinkedList<>();
        for( Country element : this.countries) {
            if(element instanceof AfricaCountry) {
                newAfricaList.add((AfricaCountry) element);
            }
        }
        return newAfricaList.toArray(new AfricaCountry[0]);

    }
    public AsiaCountry[] filterAsiaCountry() {
        List<AsiaCountry> newAsiaList = new LinkedList<>();
        for( Country element : this.countries) {
            if(element instanceof AsiaCountry) {
                newAsiaList.add((AsiaCountry) element);
            }
        }
        return newAsiaList.toArray(new AsiaCountry[0]);

    }
    public EuropeCountry[] filterEuropeCountry() {
        List<EuropeCountry> newList = new LinkedList<>();
        for (Country element : this.countries) {
            if (element instanceof EuropeCountry) {
                newList.add((EuropeCountry) element);
            }
        }
        return newList.toArray(new EuropeCountry[0]);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        List<NorthAmericaCountry> newList = new LinkedList<>();
        for (Country element : this.countries) {
            if (element instanceof NorthAmericaCountry) {
                newList.add((NorthAmericaCountry) element);
            }
        }
        return newList.toArray(new NorthAmericaCountry[0]);
    }
    public OceaniaCountry[] filterOceaniaCountry() {
        List<OceaniaCountry> newList = new LinkedList<>();
        for (Country element : this.countries) {
            if (element instanceof OceaniaCountry) {
                newList.add((OceaniaCountry) element);
            }
        }
        return newList.toArray(new OceaniaCountry[0]);
    }
    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        List<SouthAmericaCountry> newList = new LinkedList<>();
        for (Country element : this.countries) {
            if (element instanceof SouthAmericaCountry) {
                newList.add((SouthAmericaCountry) element);
            }
        }
        return newList.toArray(new SouthAmericaCountry[0]);
    }
    public Country[] filterMostPopulousCountries (int howMany) {
        Country[] sorted = sortByDecreasingPopulation();
        if(howMany > sorted.length) {
            howMany = sorted.length;
        }
        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);
        return result;

    }
    public Country[] filterLeastPopulousCountries (int howMany) {
        Country[] sorted = sortByIncreasingPopulation();
        if(howMany > sorted.length) {
            howMany = sorted.length;
        }
        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);
        return result;
    }
    public Country[] filterLargestAreaCountries (int howMany) {
        Country[] sorted = sortByDecreasingArea();
        if(howMany > sorted.length) {
            howMany = sorted.length;
        }
        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);
        return result;
    }
    public Country[] filterSmallestAreaCountries (int howMany) {
        Country[] sorted = sortByIncreasingArea();
        if(howMany > sorted.length) {
            howMany = sorted.length;
        }
        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);
        return result;
    }
    public Country[] filterHightestGdpCountries (int howMany) {
        Country[] sorted = sortByDecreasingGdp();
        if(howMany > sorted.length) {
            howMany = sorted.length;
        }
        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);
        return result;
    }
    public Country[] filterLowestGdpCountries (int howMany) {
        Country[] sorted = sortByIncreasingGdp();
        if(howMany > sorted.length) {
            howMany = sorted.length;
        }
        Country[] result = new Country[howMany];
        System.arraycopy(sorted, 0, result, 0, howMany);
        return result;
    }
    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
