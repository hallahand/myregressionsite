
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object recentRuns extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,String,String,String,Int,Form[Run],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(f1: String, f2: String, p1: String, p2: String, d: Int,  dataList: Form[Run]):play.api.templates.Html = {
        _display_ {
def /*5.2*/header/*5.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.38*/("""
    <th class=""""),_display_(Seq[Any](/*6.17*/key/*6.20*/.replace(".","_"))),format.raw/*6.37*/(""" header "headerSortUp"">
        <a href= >"""),_display_(Seq[Any](/*7.20*/title)),format.raw/*7.25*/("""</a>
    </th>
""")))};
Seq[Any](format.raw/*1.80*/("""



"""),format.raw/*9.2*/("""

"""),_display_(Seq[Any](/*11.2*/homeSkeleton/*11.14*/ {_display_(Seq[Any](format.raw/*11.16*/("""
	<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.48*/routes/*12.54*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*12.97*/("""">
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.42*/routes/*13.48*/.Application.javascriptRoutes())),format.raw/*13.79*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*14.19*/routes/*14.25*/.Assets.at("js/bootstrap.min.js"))),format.raw/*14.58*/(""""></script>	
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
       
     	  <center>
     	  <h1> """),_display_(Seq[Any](/*18.15*/if(p2 == "version.name")/*18.39*/ {_display_(Seq[Any](format.raw/*18.41*/("""
		   Last """),_display_(Seq[Any](/*19.12*/d)),format.raw/*19.13*/(""" Runs with """),_display_(Seq[Any](/*19.25*/f1)),format.raw/*19.27*/(""" Version """),_display_(Seq[Any](/*19.37*/f2)),format.raw/*19.39*/("""
		""")))})),format.raw/*20.4*/("""
     	  """),_display_(Seq[Any](/*21.10*/if(p2 != "version.name")/*21.34*/ {_display_(Seq[Any](format.raw/*21.36*/("""
     	   Last """),_display_(Seq[Any](/*22.16*/d)),format.raw/*22.17*/(""" Runs that share """),_display_(Seq[Any](/*22.35*/f1)),format.raw/*22.37*/(""" and """),_display_(Seq[Any](/*22.43*/f2)),format.raw/*22.45*/("""
     	  """)))})),format.raw/*23.10*/("""
     	  </h1> 
     	  </center>
   """),_display_(Seq[Any](/*26.5*/if(Run.dataSet(f1, f2, p1, p2).size == 0)/*26.46*/ {_display_(Seq[Any](format.raw/*26.48*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*32.7*/else/*32.12*/{_display_(Seq[Any](format.raw/*32.13*/("""     
        
        <table class="run zebra-striped">
            <thead>
                <tr>
                	"""),_display_(Seq[Any](/*37.19*/header("date.name", "Date"))),format.raw/*37.46*/("""
                    """),_display_(Seq[Any](/*38.22*/header("name", "Run Name"))),format.raw/*38.48*/("""
                    """),_display_(Seq[Any](/*39.22*/header("version.name", "Version"))),format.raw/*39.55*/("""
                    """),_display_(Seq[Any](/*40.22*/header("format.name", "Format"))),format.raw/*40.53*/("""
                    """),_display_(Seq[Any](/*41.22*/header("svn.num", "SVN"))),format.raw/*41.46*/("""
                    """),_display_(Seq[Any](/*42.22*/header("performance.time", "Performance Time"))),format.raw/*42.68*/("""
                    """),_display_(Seq[Any](/*43.22*/header("format", "Format"))),format.raw/*43.48*/("""
                    """),_display_(Seq[Any](/*44.22*/header("better", "# Better"))),format.raw/*44.50*/("""
                    """),_display_(Seq[Any](/*45.22*/header("worse", "# Worse"))),format.raw/*45.48*/("""
					"""),_display_(Seq[Any](/*46.7*/header("neutral", "# Neutral"))),format.raw/*46.37*/("""
                    """),_display_(Seq[Any](/*47.22*/header("bugs", "# Bugs"))),format.raw/*47.46*/("""
                    """),_display_(Seq[Any](/*48.22*/header("notdecompressed", "# Not Decompressed"))),format.raw/*48.69*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*53.18*/for(run <- Run.truncate(Run.dataSet(f1, f2, p1, p2), d)) yield /*53.74*/ {_display_(Seq[Any](format.raw/*53.76*/("""
                    <tr>
                    
 						<td>
                            """),_display_(Seq[Any](/*57.30*/if(run.date == null)/*57.50*/ {_display_(Seq[Any](format.raw/*57.52*/("""
                                <em>-</em>
                            """)))}/*59.31*/else/*59.36*/{_display_(Seq[Any](format.raw/*59.37*/("""
                                """),_display_(Seq[Any](/*60.34*/run/*60.37*/.date.name.format("dd MMM yyyy"))),format.raw/*60.69*/("""
                            """)))})),format.raw/*61.30*/("""
                        </td>                   
                        <td>
                            """),_display_(Seq[Any](/*64.30*/if(run.name == null)/*64.50*/ {_display_(Seq[Any](format.raw/*64.52*/("""
                                <em>-</em>
                            """)))}/*66.31*/else/*66.36*/{_display_(Seq[Any](format.raw/*66.37*/("""
                                """),_display_(Seq[Any](/*67.34*/run/*67.37*/.name)),format.raw/*67.42*/("""
                            """)))})),format.raw/*68.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*71.30*/if(run.version == null)/*71.53*/ {_display_(Seq[Any](format.raw/*71.55*/("""
                                <em>-</em>
                            """)))}/*73.31*/else/*73.36*/{_display_(Seq[Any](format.raw/*73.37*/("""
                                """),_display_(Seq[Any](/*74.34*/run/*74.37*/.version.name)),format.raw/*74.50*/(""" of """),_display_(Seq[Any](/*74.55*/run/*74.58*/.version.platform.name)),format.raw/*74.80*/("""
                            """)))})),format.raw/*75.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*78.30*/if(run.format == null)/*78.52*/ {_display_(Seq[Any](format.raw/*78.54*/("""
                                <em>-</em>
                            """)))}/*80.31*/else/*80.36*/{_display_(Seq[Any](format.raw/*80.37*/("""
                                """),_display_(Seq[Any](/*81.34*/run/*81.37*/.format.name)),format.raw/*81.49*/("""
                            """)))})),format.raw/*82.30*/("""
                        </td>

						<td>
                            """),_display_(Seq[Any](/*86.30*/if(run.svn == null)/*86.49*/ {_display_(Seq[Any](format.raw/*86.51*/("""
                                <em>-</em>
                            """)))}/*88.31*/else/*88.36*/{_display_(Seq[Any](format.raw/*88.37*/("""
                                """),_display_(Seq[Any](/*89.34*/run/*89.37*/.svn.num)),format.raw/*89.45*/("""
                            """)))})),format.raw/*90.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*93.30*/if(run.performance == null)/*93.57*/ {_display_(Seq[Any](format.raw/*93.59*/("""
                                <em>-</em>
                            """)))}/*95.31*/else/*95.36*/{_display_(Seq[Any](format.raw/*95.37*/("""
                                """),_display_(Seq[Any](/*96.34*/run/*96.37*/.performance.time.format("hh:mm:ss"))),format.raw/*96.73*/("""
                            """)))})),format.raw/*97.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*100.30*/if(run.format.name == null)/*100.57*/ {_display_(Seq[Any](format.raw/*100.59*/("""
                                <em>-</em>
                            """)))}/*102.31*/else/*102.36*/{_display_(Seq[Any](format.raw/*102.37*/("""
                                """),_display_(Seq[Any](/*103.34*/run/*103.37*/.format.name)),format.raw/*103.49*/("""
                            """)))})),format.raw/*104.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*107.30*/if(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Better"))) == 0)/*107.127*/ {_display_(Seq[Any](format.raw/*107.129*/("""
                                <em>-</em>
                            """)))}/*109.31*/else/*109.36*/{_display_(Seq[Any](format.raw/*109.37*/("""
                                """),_display_(Seq[Any](/*110.34*/(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Better")))))),format.raw/*110.124*/("""
                            """)))})),format.raw/*111.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*114.30*/if(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Worse"))) == 0)/*114.126*/ {_display_(Seq[Any](format.raw/*114.128*/("""
                                <em>-</em>
                            """)))}/*116.31*/else/*116.36*/{_display_(Seq[Any](format.raw/*116.37*/("""
                                """),_display_(Seq[Any](/*117.34*/(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Worse")))))),format.raw/*117.123*/("""
                            """)))})),format.raw/*118.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*121.30*/if(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Neutral"))) == 0)/*121.128*/ {_display_(Seq[Any](format.raw/*121.130*/("""
                                <em>-</em>
                            """)))}/*123.31*/else/*123.36*/{_display_(Seq[Any](format.raw/*123.37*/("""
                                """),_display_(Seq[Any](/*124.34*/(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Neutral")))))),format.raw/*124.125*/("""
                            """)))})),format.raw/*125.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*128.30*/if(Run.calculateBugs(run) == 0)/*128.61*/ {_display_(Seq[Any](format.raw/*128.63*/("""
                                <em>-</em>
                            """)))}/*130.31*/else/*130.36*/{_display_(Seq[Any](format.raw/*130.37*/("""
                                """),_display_(Seq[Any](/*131.34*/(Run.calculateBugs(run)))),format.raw/*131.58*/("""
                            """)))})),format.raw/*132.30*/("""
                        </td>
						<td>
                           
                               """),_display_(Seq[Any](/*136.33*/PageOut/*136.40*/.getPagesNotDecompressed(run.id))),format.raw/*136.72*/("""
                            
                        </td>
                        
                    </tr>
                """)))})),format.raw/*141.18*/("""

            </tbody>
        </table>
     
	<p>
	
	</p>

      """),_display_(Seq[Any](/*150.8*/if(Run.dataSet(f1, f2, p1, p2).size >= 2)/*150.49*/ {_display_(Seq[Any](format.raw/*150.51*/("""
     
        <p>
	
		</p>
		 <center><h1>Total Stats</h1> </center>
         <table class="run zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*159.22*/header("Runs", "Number of runs"))),format.raw/*159.54*/("""
                    """),_display_(Seq[Any](/*160.22*/header("better", "Total # Better"))),format.raw/*160.56*/("""
                    """),_display_(Seq[Any](/*161.22*/header("worse", "Total # Worse"))),format.raw/*161.54*/("""
					"""),_display_(Seq[Any](/*162.7*/header("neutral", "Total # Neutral"))),format.raw/*162.43*/("""
                    """),_display_(Seq[Any](/*163.22*/header("bugs", "Total # Bugs"))),format.raw/*163.52*/("""
                    """),_display_(Seq[Any](/*164.22*/header("notdecompressed", "Total # Not Decompressed"))),format.raw/*164.75*/("""
                </tr>
            </thead>
            <tbody>
		
              
                    <tr>
                    	<td>
                                """),_display_(Seq[Any](/*172.34*/Run/*172.37*/.truncate(Run.dataSet(f1, f2, p1, p2), d))),format.raw/*172.78*/(""").size                         
                        </td>
						<td>
                                """),_display_(Seq[Any](/*175.34*/Run/*175.37*/.getData(Run.truncate(Run.dataSet(f1, f2, p1, p2), d)).better)),format.raw/*175.98*/("""                       
                        </td>
                        <td>
                                """),_display_(Seq[Any](/*178.34*/Run/*178.37*/.getData(Run.truncate(Run.dataSet(f1, f2, p1, p2), d)).worse)),format.raw/*178.97*/("""                          
                        </td>
						<td>
                                """),_display_(Seq[Any](/*181.34*/Run/*181.37*/.getData(Run.truncate(Run.dataSet(f1, f2, p1, p2), d)).neutral)),format.raw/*181.99*/("""                             
                        </td>
						<td>
                                """),_display_(Seq[Any](/*184.34*/Run/*184.37*/.getData(Run.truncate(Run.dataSet(f1, f2, p1, p2), d)).bugs)),format.raw/*184.96*/("""            
                        </td>
						<td>
                             
                        </td>
                    </tr>
              	  
              	

            </tbody>
        </table>
        
    """)))})),format.raw/*196.6*/(""" 
       
         <table class="run zebra-striped">
            <thead>
                <tr>
                    
                    """),_display_(Seq[Any](/*202.22*/header("better", "Average Better"))),format.raw/*202.56*/("""
                    """),_display_(Seq[Any](/*203.22*/header("worse", "Average Worse"))),format.raw/*203.54*/("""
					"""),_display_(Seq[Any](/*204.7*/header("neutral", "Average Neutral"))),format.raw/*204.43*/("""
                    """),_display_(Seq[Any](/*205.22*/header("bugs", "Average Bugs"))),format.raw/*205.52*/("""
                    """),_display_(Seq[Any](/*206.22*/header("notdecompressed", "Average Total # Not Decompressed"))),format.raw/*206.83*/("""
                </tr>
            </thead>
            <tbody>
		
              
                    <tr>
						<td>
                                """),_display_(Seq[Any](/*214.34*/(CallData.divide(Run.getData(Run.truncate(Run.dataSet(f1, f2, p1, p2), d)).better, Run.dataSet(f1, f2, p1, p2).size)))),format.raw/*214.151*/("""  
                                                         
                        </td>
                        <td>
                                """),_display_(Seq[Any](/*218.34*/(CallData.divide(Run.getData(Run.truncate(Run.dataSet(f1, f2, p1, p2), d)).worse, Run.dataSet(f1, f2, p1, p2).size)))),format.raw/*218.150*/("""                          
                        </td>
						<td>
                                """),_display_(Seq[Any](/*221.34*/(CallData.divide(Run.getData(Run.truncate(Run.dataSet(f1, f2, p1, p2), d)).neutral, Run.dataSet(f1, f2, p1, p2).size)))),format.raw/*221.152*/("""                       
                        </td>
						<td>
                                """),_display_(Seq[Any](/*224.34*/CallData/*224.42*/.divide(Run.getData(Run.truncate(Run.dataSet(f1, f2, p1, p2), d)).bugs, Run.dataSet(f1, f2, p1, p2).size))),format.raw/*224.147*/(""") 
                        </td>
						<td>
                                """),_display_(Seq[Any](/*227.34*/(CallData.divide(Run.getData(Run.truncate(Run.dataSet(f1, f2, p1, p2), d)).notDecompressed, Run.dataSet(f1, f2, p1, p2).size)))),format.raw/*227.160*/("""
                        </td>
                    </tr>
              	  
              	

            </tbody>
        </table>
         <input type = "button" id = "test" value= "Download in Excel" class="btn primary" 
      		onclick = "download('"""),_display_(Seq[Any](/*236.31*/f1)),format.raw/*236.33*/("""','"""),_display_(Seq[Any](/*236.37*/f2)),format.raw/*236.39*/("""', '"""),_display_(Seq[Any](/*236.44*/p1)),format.raw/*236.46*/("""', '"""),_display_(Seq[Any](/*236.51*/p2)),format.raw/*236.53*/("""')" method = "POST"/>
		<script>
			function download(f1,f2,p1,p2) """),format.raw/*238.35*/("""{"""),format.raw/*238.36*/("""

			window.location = jsRoutes.controllers.Application.createFile(f1,f2,p1,p2).url ;
	
	
				"""),format.raw/*243.5*/("""}"""),format.raw/*243.6*/("""
		</script>
       
    """)))})),format.raw/*246.6*/("""    
""")))})))}
    }
    
    def render(f1:String,f2:String,p1:String,p2:String,d:Int,dataList:Form[Run]): play.api.templates.Html = apply(f1,f2,p1,p2,d,dataList)
    
    def f:((String,String,String,String,Int,Form[Run]) => play.api.templates.Html) = (f1,f2,p1,p2,d,dataList) => apply(f1,f2,p1,p2,d,dataList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 19 17:13:45 EST 2013
                    SOURCE: C:/tmp/myregressionsite/app/views/recentRuns.scala.html
                    HASH: 1457596938a1139e01a7405aca5ae0d3e89386e0
                    MATRIX: 763->1|901->88|914->94|1007->124|1060->142|1071->145|1109->162|1189->207|1215->212|1272->79|1306->230|1346->235|1367->247|1407->249|1492->298|1507->304|1572->347|1653->392|1668->398|1721->429|1788->460|1803->466|1858->499|2043->648|2076->672|2116->674|2165->687|2188->688|2236->700|2260->702|2306->712|2330->714|2366->719|2413->730|2446->754|2486->756|2539->773|2562->774|2616->792|2640->794|2682->800|2706->802|2749->813|2825->854|2875->895|2915->897|3045->1010|3058->1015|3097->1016|3254->1137|3303->1164|3362->1187|3410->1213|3469->1236|3524->1269|3583->1292|3636->1323|3695->1346|3741->1370|3800->1393|3868->1439|3927->1462|3975->1488|4034->1511|4084->1539|4143->1562|4191->1588|4234->1596|4286->1626|4345->1649|4391->1673|4450->1696|4519->1743|4642->1830|4714->1886|4754->1888|4882->1980|4911->2000|4951->2002|5045->2078|5058->2083|5097->2084|5168->2119|5180->2122|5234->2154|5297->2185|5444->2296|5473->2316|5513->2318|5607->2394|5620->2399|5659->2400|5730->2435|5742->2438|5769->2443|5832->2474|5942->2548|5974->2571|6014->2573|6108->2649|6121->2654|6160->2655|6231->2690|6243->2693|6278->2706|6319->2711|6331->2714|6375->2736|6438->2767|6566->2859|6597->2881|6637->2883|6731->2959|6744->2964|6783->2965|6854->3000|6866->3003|6900->3015|6963->3046|7075->3122|7103->3141|7143->3143|7237->3219|7250->3224|7289->3225|7360->3260|7372->3263|7402->3271|7465->3302|7575->3376|7611->3403|7651->3405|7745->3481|7758->3486|7797->3487|7868->3522|7880->3525|7938->3561|8001->3592|8130->3684|8167->3711|8208->3713|8303->3789|8317->3794|8357->3795|8429->3830|8442->3833|8477->3845|8541->3876|8652->3950|8760->4047|8802->4049|8897->4125|8911->4130|8951->4131|9023->4166|9137->4256|9201->4287|9330->4379|9437->4475|9479->4477|9574->4553|9588->4558|9628->4559|9700->4594|9813->4683|9877->4714|9988->4788|10097->4886|10139->4888|10234->4964|10248->4969|10288->4970|10360->5005|10475->5096|10539->5127|10650->5201|10691->5232|10732->5234|10827->5310|10841->5315|10881->5316|10953->5351|11000->5375|11064->5406|11207->5512|11224->5519|11279->5551|11445->5684|11557->5760|11608->5801|11649->5803|11870->5987|11925->6019|11985->6042|12042->6076|12102->6099|12157->6131|12201->6139|12260->6175|12320->6198|12373->6228|12433->6251|12509->6304|12720->6478|12733->6481|12797->6522|12943->6631|12956->6634|13040->6695|13196->6814|13209->6817|13292->6877|13433->6981|13446->6984|13531->7046|13675->7153|13688->7156|13770->7215|14041->7454|14220->7596|14277->7630|14337->7653|14392->7685|14436->7693|14495->7729|14555->7752|14608->7782|14668->7805|14752->7866|14948->8025|15089->8142|15283->8299|15423->8415|15564->8519|15706->8637|15844->8738|15862->8746|15991->8851|16108->8931|16258->9057|16556->9318|16581->9320|16622->9324|16647->9326|16689->9331|16714->9333|16756->9338|16781->9340|16879->9409|16909->9410|17036->9509|17065->9510|17126->9539
                    LINES: 26->1|28->5|28->5|30->5|31->6|31->6|31->6|32->7|32->7|35->1|39->9|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|48->18|48->18|48->18|49->19|49->19|49->19|49->19|49->19|49->19|50->20|51->21|51->21|51->21|52->22|52->22|52->22|52->22|52->22|52->22|53->23|56->26|56->26|56->26|62->32|62->32|62->32|67->37|67->37|68->38|68->38|69->39|69->39|70->40|70->40|71->41|71->41|72->42|72->42|73->43|73->43|74->44|74->44|75->45|75->45|76->46|76->46|77->47|77->47|78->48|78->48|83->53|83->53|83->53|87->57|87->57|87->57|89->59|89->59|89->59|90->60|90->60|90->60|91->61|94->64|94->64|94->64|96->66|96->66|96->66|97->67|97->67|97->67|98->68|101->71|101->71|101->71|103->73|103->73|103->73|104->74|104->74|104->74|104->74|104->74|104->74|105->75|108->78|108->78|108->78|110->80|110->80|110->80|111->81|111->81|111->81|112->82|116->86|116->86|116->86|118->88|118->88|118->88|119->89|119->89|119->89|120->90|123->93|123->93|123->93|125->95|125->95|125->95|126->96|126->96|126->96|127->97|130->100|130->100|130->100|132->102|132->102|132->102|133->103|133->103|133->103|134->104|137->107|137->107|137->107|139->109|139->109|139->109|140->110|140->110|141->111|144->114|144->114|144->114|146->116|146->116|146->116|147->117|147->117|148->118|151->121|151->121|151->121|153->123|153->123|153->123|154->124|154->124|155->125|158->128|158->128|158->128|160->130|160->130|160->130|161->131|161->131|162->132|166->136|166->136|166->136|171->141|180->150|180->150|180->150|189->159|189->159|190->160|190->160|191->161|191->161|192->162|192->162|193->163|193->163|194->164|194->164|202->172|202->172|202->172|205->175|205->175|205->175|208->178|208->178|208->178|211->181|211->181|211->181|214->184|214->184|214->184|226->196|232->202|232->202|233->203|233->203|234->204|234->204|235->205|235->205|236->206|236->206|244->214|244->214|248->218|248->218|251->221|251->221|254->224|254->224|254->224|257->227|257->227|266->236|266->236|266->236|266->236|266->236|266->236|266->236|266->236|268->238|268->238|273->243|273->243|276->246
                    -- GENERATED --
                */
            