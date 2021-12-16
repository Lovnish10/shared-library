import Utilities
def call(script){
  // Utilities utl = new Utilities(script)
    
    node(){
   
    echo 'hello world'
      echo "this value is given by :${script}"
      def maven = tool 'Maven 3.8.3'
      println maven.getClass()
      println "maven is ${maven}"
      
      def records = [['key', 'value'], ['a', 'b']]
writeCSV file: 'output.csv', records: records, format: CSVFormat.EXCEL
        
    }
}
