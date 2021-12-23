/**
 *
 * @author Saif Jouda, Youssef Youssef
 *
 *	Data Object class
 *	maintains an object containing data for the use of analysis and MainUI
 */
package statsVisualiser.gui;

public class DataObject {
  private String countryName;
  private int countryNum;
  private	int time1Name;
  private int time2Name;
  private int analysisNum;
  private String analysisType;
  private float[][] data;
  private int series;
  private String[] seriesNames;
  private int[] years;

  /**
   * Constructor
   * @param country the country
   * @param time1 the "from" year
   * @param time2 the  "to" year
   * @param analysis the analysis type
   */
  public DataObject(String country, int time1, int time2, String analysis){
  	countryName=country;
    time1Name=time1;
    time2Name=time2;
    analysisType=analysis;
    }

  /**
   * Constructor
   * @param country the country
   * @param time1 the "from" year
   * @param time2 the "to" year
   * @param analysis the type
   * @param seriesInput the series
   * @param dataInput the data array
   * @param years the years array
   */
  public DataObject(String country, int time1, int time2, String analysis,String[] seriesInput,float[][] dataInput, int[] years){
  data=dataInput;
  series= seriesInput.length;
	seriesNames=seriesInput;
	countryName=country;
  time1Name=time1;
  time2Name=time2;
  analysisType=analysis;
  this.years = years;
  }

  /**
   * gets the country
   * @return the country
   */
  public String getCountry(){
    return countryName;
  }

  /**
   * gets the first year
   * @return the "from" year
   */
  public int getTime1(){
    return time1Name;
  }

  /**
   * gets the second year
   * @return the "to" year
   */
  public int getTime2(){
    return time2Name;
  }

  /**
   * get the analysis type
   * @return string of the type
   */
  public String getAnalysis(){
    return analysisType;
  }

  /**
   * set the data
   * @param newData float array
   */
  public void setData(float[][] newData){
    data=newData;
  }

  /**
   * sets the series
   * @param a integer
   */
  public void setSeries(int a) {
	  series=a;
  }

  /**
   * gets the series
   * @return integer
   */
  public int getSeries() {
	  return series;
  }

  /**
   * get the data
   * @return
   */
  public float[][] getData() {
	  return data;
  }

  /**
   * get series names
   * @return string array
   */
  public String[] getSeriesNames() {
	  return seriesNames;
  }

  /**
   * gets the years
   * @return integer array storing the years
   */
  public int[] years() {
          return years;
      }

      /**
       * gets units of analysis
       * @return String array storing units
       */

  public String[] getName() {
	  if (getAnalysis().equals("CO2 emissions vs Energy use vs PM2.5 air pollution, mean annual exposure")) {
		  String[] str = new String[3];
		  str[0] =  "metric tons per capita";
		  str[1] = "kg of oil equivalent per capita";
		  str[2] = "Micrograms per cubric meter";
		  return str;
	  }
	  else if (getAnalysis().equals("PM2.5 air pollution, mean annual exposure vs Forest area")) {
		  String[] str = new String[2];
		  str[1] = "% of land area";
		  str[0] = "Micrograms per cubric meter";
		  return str;
	  }
	  else if (getAnalysis().equals("Ratio of CO2 emissions and GDP per capita (current US$)")) {
		  String[] str = new String[2];
		  str[0] =  "metric tons per capita";
		  str[1] = "current US$";
		  return str;
	  }
	  else if (getAnalysis().equals("Average Forest area for the selected years")) {
		  String[] str = new String[1];
		  str[0] =  "% of land area";
		  return str;

	  }
	  else if (getAnalysis().equals("Average of Government expenditure on education, total for the selected years")) {
		  String[] str = new String[1];
		  str[0] =  "% of GDP";
		  return str;
	  }
	  else if (getAnalysis().equals("Ratio of Hospital beds and Current health expenditure")) {
		  String[] str = new String[2];
		  str[0] =  "Per 1000 people";
		  str[1] = "% of GDP";
		  return str;
	  }
	  else if (getAnalysis().equals("Current health expenditure per capita vs Mortality rate, infant")) {
		  String[] str = new String[2];
		  str[0] =  "current US$";
		  str[1] = "Per 1000 live births";
		  return str;
	  }
	  else {
		  String[] str = new String[2];
		  str[0] =  "% of GDP";
		  str[1] = "% of GDP";
		  return str;
	  }

  }

}
