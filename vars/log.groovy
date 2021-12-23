import Utilities
import org.apache.commons.csv.CSVFormat

def call(script){
  // Utilities utl = new Utilities(script)
    
    node(){
      
      bat 'echo "Hello wolrd from bat ${BUILD_NUMBER}"'
      bat "echo 'Hello wolrd from bat ${BUILD_NUMBER}'"
    echo 'hello world'
      echo "this value is given by :${script}"
      def maven = tool 'Maven 3.8.3'
      println maven.getClass()
      println "maven is ${maven}"
      
   //   def records = [["key", "value"], ["a", "b"],["e","f"]]
//writeCSV file: 'output.csv', records: records, format: CSVFormat.EXCEL
        
    }
}
