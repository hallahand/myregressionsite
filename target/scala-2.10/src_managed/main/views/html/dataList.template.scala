
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
object dataList extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,String,Form[Run],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(f1: String, f2: String, p1: String, p2: String, dataList: Form[Run]):play.api.templates.Html = {
        _display_ {
def /*5.2*/header/*5.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.38*/("""
    <th class=""""),_display_(Seq[Any](/*6.17*/key/*6.20*/.replace(".","_"))),format.raw/*6.37*/(""" header "headerSortUp"">
        <a href= >"""),_display_(Seq[Any](/*7.20*/title)),format.raw/*7.25*/("""</a>
    </th>
""")))};
Seq[Any](format.raw/*1.71*/("""



"""),format.raw/*9.2*/("""

"""),_display_(Seq[Any](/*11.2*/homeSkeleton/*11.14*/ {_display_(Seq[Any](format.raw/*11.16*/("""
	<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.48*/routes/*12.54*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*12.97*/("""">
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.42*/routes/*13.48*/.Application.javascriptRoutes())),format.raw/*13.79*/(""""></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
       
    </h1>
     	  <center><h1>
     	  """),_display_(Seq[Any](/*18.10*/if(p2 == "version.name")/*18.34*/ {_display_(Seq[Any](format.raw/*18.36*/("""
		  Runs with """),_display_(Seq[Any](/*19.16*/f1)),format.raw/*19.18*/(""" Version """),_display_(Seq[Any](/*19.28*/f2)),format.raw/*19.30*/("""
		""")))})),format.raw/*20.4*/("""
     	  """),_display_(Seq[Any](/*21.10*/if(p2 != "version.name")/*21.34*/ {_display_(Seq[Any](format.raw/*21.36*/("""
     	  Runs that share """),_display_(Seq[Any](/*22.26*/f1)),format.raw/*22.28*/(""" and """),_display_(Seq[Any](/*22.34*/f2)),format.raw/*22.36*/("""
     	  """)))})),format.raw/*23.10*/("""
     	  </h1> 
     	  
     	  </center>
   """),_display_(Seq[Any](/*27.5*/if(Run.dataSet(f1, f2, p1, p2).size == 0)/*27.46*/ {_display_(Seq[Any](format.raw/*27.48*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*33.7*/else/*33.12*/{_display_(Seq[Any](format.raw/*33.13*/("""     
        
        <table class="run zebra-striped">
            <thead>
                <tr>
                	"""),_display_(Seq[Any](/*38.19*/header("date.name", "Date"))),format.raw/*38.46*/("""
                    """),_display_(Seq[Any](/*39.22*/header("name", "Run Name"))),format.raw/*39.48*/("""
                    """),_display_(Seq[Any](/*40.22*/header("version.name", "Version"))),format.raw/*40.55*/("""
                    """),_display_(Seq[Any](/*41.22*/header("format.name", "Format"))),format.raw/*41.53*/("""
                    """),_display_(Seq[Any](/*42.22*/header("svn.num", "SVN"))),format.raw/*42.46*/("""
                    """),_display_(Seq[Any](/*43.22*/header("performance.time", "Performance Time"))),format.raw/*43.68*/("""
                    """),_display_(Seq[Any](/*44.22*/header("better", "# Better"))),format.raw/*44.50*/("""
                    """),_display_(Seq[Any](/*45.22*/header("worse", "# Worse"))),format.raw/*45.48*/("""
					"""),_display_(Seq[Any](/*46.7*/header("neutral", "# Neutral"))),format.raw/*46.37*/("""
                    """),_display_(Seq[Any](/*47.22*/header("bugs", "# Bugs"))),format.raw/*47.46*/("""
                    """),_display_(Seq[Any](/*48.22*/header("notdecompressed", "# Not Decompressed"))),format.raw/*48.69*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*53.18*/for(run <- Run.dataSet(f1, f2, p1, p2)) yield /*53.57*/ {_display_(Seq[Any](format.raw/*53.59*/("""
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
                            """),_display_(Seq[Any](/*101.30*/if(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Better"))) == 0)/*101.127*/ {_display_(Seq[Any](format.raw/*101.129*/("""
                                <em>-</em>
                            """)))}/*103.31*/else/*103.36*/{_display_(Seq[Any](format.raw/*103.37*/("""
                                """),_display_(Seq[Any](/*104.34*/(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Better")))))),format.raw/*104.124*/("""
                            """)))})),format.raw/*105.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*108.30*/if(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Worse"))) == 0)/*108.126*/ {_display_(Seq[Any](format.raw/*108.128*/("""
                                <em>-</em>
                            """)))}/*110.31*/else/*110.36*/{_display_(Seq[Any](format.raw/*110.37*/("""
                                """),_display_(Seq[Any](/*111.34*/(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Worse")))))),format.raw/*111.123*/("""
                            """)))})),format.raw/*112.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*115.30*/if(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Neutral"))) == 0)/*115.128*/ {_display_(Seq[Any](format.raw/*115.130*/("""
                                <em>-</em>
                            """)))}/*117.31*/else/*117.36*/{_display_(Seq[Any](format.raw/*117.37*/("""
                                """),_display_(Seq[Any](/*118.34*/(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Neutral")))))),format.raw/*118.125*/("""
                            """)))})),format.raw/*119.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*122.30*/if(Run.calculateBugs(run) == 0)/*122.61*/ {_display_(Seq[Any](format.raw/*122.63*/("""
                                <em>-</em>
                            """)))}/*124.31*/else/*124.36*/{_display_(Seq[Any](format.raw/*124.37*/("""
                                """),_display_(Seq[Any](/*125.34*/(Run.calculateBugs(run)))),format.raw/*125.58*/("""
                            """)))})),format.raw/*126.30*/("""
                        </td>
						<td>
                           
                               """),_display_(Seq[Any](/*130.33*/PageOut/*130.40*/.getPagesNotDecompressed(run.id))),format.raw/*130.72*/("""
                            
                        </td>
                        
                    </tr>
                """)))})),format.raw/*135.18*/("""

            </tbody>
        </table>
     
	<p>
	
	</p>

      """),_display_(Seq[Any](/*144.8*/if(Run.dataSet(f1, f2, p1, p2).size >= 2)/*144.49*/ {_display_(Seq[Any](format.raw/*144.51*/("""
     
        <p>
	
		</p>
		 <center><h1>Total Stats</h1> </center>
         <table class="run zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*153.22*/header("Runs", "Number of runs"))),format.raw/*153.54*/("""
                    """),_display_(Seq[Any](/*154.22*/header("better", "Total # Better"))),format.raw/*154.56*/("""
                    """),_display_(Seq[Any](/*155.22*/header("worse", "Total # Worse"))),format.raw/*155.54*/("""
					"""),_display_(Seq[Any](/*156.7*/header("neutral", "Total # Neutral"))),format.raw/*156.43*/("""
                    """),_display_(Seq[Any](/*157.22*/header("bugs", "Total # Bugs"))),format.raw/*157.52*/("""
                    """),_display_(Seq[Any](/*158.22*/header("notdecompressed", "Total # Not Decompressed"))),format.raw/*158.75*/("""
                </tr>
            </thead>
            <tbody>
		
              
                    <tr>
                    	<td>
                                """),_display_(Seq[Any](/*166.34*/Run/*166.37*/.dataSet(f1, f2, p1, p2).size)),format.raw/*166.66*/("""                          
                        </td>
						<td>
                                """),_display_(Seq[Any](/*169.34*/Run/*169.37*/.getData(Run.dataSet(f1, f2, p1, p2)).better)),format.raw/*169.81*/("""                          
                        </td>
                        <td>
                                """),_display_(Seq[Any](/*172.34*/Run/*172.37*/.getData(Run.dataSet(f1, f2, p1, p2)).worse)),format.raw/*172.80*/("""                            
                        </td>
						<td>
                                """),_display_(Seq[Any](/*175.34*/Run/*175.37*/.getData(Run.dataSet(f1, f2, p1, p2)).neutral)),format.raw/*175.82*/("""                            
                        </td>
						<td>
                                """),_display_(Seq[Any](/*178.34*/Run/*178.37*/.getData(Run.dataSet(f1, f2, p1, p2)).bugs)),format.raw/*178.79*/("""           
                        </td>
						<td>
                             	"""),_display_(Seq[Any](/*181.32*/Run/*181.35*/.getData(Run.dataSet(f1, f2, p1, p2)).notDecompressed)),format.raw/*181.88*/(""" 
                        </td>
                    </tr>
              	  
              	

            </tbody>
        </table>
        
    """)))})),format.raw/*190.6*/(""" 
       
         <table class="run zebra-striped">
            <thead>
                <tr>
                    
                    """),_display_(Seq[Any](/*196.22*/header("better", "Average Better"))),format.raw/*196.56*/("""
                    """),_display_(Seq[Any](/*197.22*/header("worse", "Average Worse"))),format.raw/*197.54*/("""
					"""),_display_(Seq[Any](/*198.7*/header("neutral", "Average Neutral"))),format.raw/*198.43*/("""
                    """),_display_(Seq[Any](/*199.22*/header("bugs", "Average Bugs"))),format.raw/*199.52*/("""
                    """),_display_(Seq[Any](/*200.22*/header("notdecompressed", "Average Total # Not Decompressed"))),format.raw/*200.83*/("""
                </tr>
            </thead>
            <tbody>
		
              
                    <tr>
						<td>
                                """),_display_(Seq[Any](/*208.34*/(CallData.divide(Run.getData(Run.dataSet(f1, f2, p1, p2)).better, Run.dataSet(f1, f2, p1, p2).size)))),format.raw/*208.134*/("""  
                                                         
                        </td>
                        <td>
                                """),_display_(Seq[Any](/*212.34*/(CallData.divide(Run.getData(Run.dataSet(f1, f2, p1, p2)).worse, Run.dataSet(f1, f2, p1, p2).size)))),format.raw/*212.133*/("""                          
                        </td>
						<td>
                                """),_display_(Seq[Any](/*215.34*/(CallData.divide(Run.getData(Run.dataSet(f1, f2, p1, p2)).neutral, Run.dataSet(f1, f2, p1, p2).size)))),format.raw/*215.135*/("""                       
                        </td>
						<td>
                                """),_display_(Seq[Any](/*218.34*/(CallData.divide(Run.getData(Run.dataSet(f1, f2, p1, p2)).bugs, Run.dataSet(f1, f2, p1, p2).size)))),format.raw/*218.132*/(""" 
                        </td>
						<td>
                                """),_display_(Seq[Any](/*221.34*/(CallData.divide(Run.getData(Run.dataSet(f1, f2, p1, p2)).notDecompressed, Run.dataSet(f1, f2, p1, p2).size)))),format.raw/*221.143*/("""
                        </td>
                    </tr>
              	  
              	

            </tbody>
        </table>
        <input type = "button" id = "test" value= "Download in Excel" class="btn primary" 
    	  onclick = "download('"""),_display_(Seq[Any](/*230.30*/f1)),format.raw/*230.32*/("""','"""),_display_(Seq[Any](/*230.36*/f2)),format.raw/*230.38*/("""', '"""),_display_(Seq[Any](/*230.43*/p1)),format.raw/*230.45*/("""', '"""),_display_(Seq[Any](/*230.50*/p2)),format.raw/*230.52*/("""')" method = "POST"/>
		<script>
			function download(f1,f2,p1,p2) """),format.raw/*232.35*/("""{"""),format.raw/*232.36*/("""

			window.location = jsRoutes.controllers.Application.createFile(f1,f2,p1,p2).url ;
	
	
				"""),format.raw/*237.5*/("""}"""),format.raw/*237.6*/("""
		</script>
       
    """)))})),format.raw/*240.6*/("""    
""")))})),format.raw/*241.2*/("""
"""))}
    }
    
    def render(f1:String,f2:String,p1:String,p2:String,dataList:Form[Run]): play.api.templates.Html = apply(f1,f2,p1,p2,dataList)
    
    def f:((String,String,String,String,Form[Run]) => play.api.templates.Html) = (f1,f2,p1,p2,dataList) => apply(f1,f2,p1,p2,dataList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 19 12:19:51 EST 2013
                    SOURCE: C:/Users/dhallahan/workspace/regressionsiteRnd2-1/eclipse-regressionsite/app/views/dataList.scala.html
                    HASH: 4ce1fa566ecad1f170f83301e168b586a71c7bb2
                    MATRIX: 757->1|886->79|899->85|992->115|1045->133|1056->136|1094->153|1174->198|1200->203|1257->70|1291->221|1331->226|1352->238|1392->240|1477->289|1492->295|1557->338|1638->383|1653->389|1706->420|1900->578|1933->602|1973->604|2026->621|2050->623|2096->633|2120->635|2156->640|2203->651|2236->675|2276->677|2339->704|2363->706|2405->712|2429->714|2472->725|2558->776|2608->817|2648->819|2778->932|2791->937|2830->938|2987->1059|3036->1086|3095->1109|3143->1135|3202->1158|3257->1191|3316->1214|3369->1245|3428->1268|3474->1292|3533->1315|3601->1361|3660->1384|3710->1412|3769->1435|3817->1461|3860->1469|3912->1499|3971->1522|4017->1546|4076->1569|4145->1616|4268->1703|4323->1742|4363->1744|4491->1836|4520->1856|4560->1858|4654->1934|4667->1939|4706->1940|4777->1975|4789->1978|4843->2010|4906->2041|5053->2152|5082->2172|5122->2174|5216->2250|5229->2255|5268->2256|5339->2291|5351->2294|5378->2299|5441->2330|5551->2404|5583->2427|5623->2429|5717->2505|5730->2510|5769->2511|5840->2546|5852->2549|5887->2562|5928->2567|5940->2570|5984->2592|6047->2623|6175->2715|6206->2737|6246->2739|6340->2815|6353->2820|6392->2821|6463->2856|6475->2859|6509->2871|6572->2902|6684->2978|6712->2997|6752->2999|6846->3075|6859->3080|6898->3081|6969->3116|6981->3119|7011->3127|7074->3158|7184->3232|7220->3259|7260->3261|7354->3337|7367->3342|7406->3343|7477->3378|7489->3381|7547->3417|7610->3448|7723->3524|7831->3621|7873->3623|7968->3699|7982->3704|8022->3705|8094->3740|8208->3830|8272->3861|8401->3953|8508->4049|8550->4051|8645->4127|8659->4132|8699->4133|8771->4168|8884->4257|8948->4288|9059->4362|9168->4460|9210->4462|9305->4538|9319->4543|9359->4544|9431->4579|9546->4670|9610->4701|9721->4775|9762->4806|9803->4808|9898->4884|9912->4889|9952->4890|10024->4925|10071->4949|10135->4980|10278->5086|10295->5093|10350->5125|10516->5258|10628->5334|10679->5375|10720->5377|10941->5561|10996->5593|11056->5616|11113->5650|11173->5673|11228->5705|11272->5713|11331->5749|11391->5772|11444->5802|11504->5825|11580->5878|11791->6052|11804->6055|11856->6084|11997->6188|12010->6191|12077->6235|12236->6357|12249->6360|12315->6403|12458->6509|12471->6512|12539->6557|12682->6663|12695->6666|12760->6708|12884->6795|12897->6798|12973->6851|13159->7005|13338->7147|13395->7181|13455->7204|13510->7236|13554->7244|13613->7280|13673->7303|13726->7333|13786->7356|13870->7417|14066->7576|14190->7676|14384->7833|14507->7932|14648->8036|14773->8137|14911->8238|15033->8336|15149->8415|15282->8524|15578->8783|15603->8785|15644->8789|15669->8791|15711->8796|15736->8798|15778->8803|15803->8805|15901->8874|15931->8875|16058->8974|16087->8975|16148->9004|16187->9011
                    LINES: 26->1|28->5|28->5|30->5|31->6|31->6|31->6|32->7|32->7|35->1|39->9|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|48->18|48->18|48->18|49->19|49->19|49->19|49->19|50->20|51->21|51->21|51->21|52->22|52->22|52->22|52->22|53->23|57->27|57->27|57->27|63->33|63->33|63->33|68->38|68->38|69->39|69->39|70->40|70->40|71->41|71->41|72->42|72->42|73->43|73->43|74->44|74->44|75->45|75->45|76->46|76->46|77->47|77->47|78->48|78->48|83->53|83->53|83->53|87->57|87->57|87->57|89->59|89->59|89->59|90->60|90->60|90->60|91->61|94->64|94->64|94->64|96->66|96->66|96->66|97->67|97->67|97->67|98->68|101->71|101->71|101->71|103->73|103->73|103->73|104->74|104->74|104->74|104->74|104->74|104->74|105->75|108->78|108->78|108->78|110->80|110->80|110->80|111->81|111->81|111->81|112->82|116->86|116->86|116->86|118->88|118->88|118->88|119->89|119->89|119->89|120->90|123->93|123->93|123->93|125->95|125->95|125->95|126->96|126->96|126->96|127->97|131->101|131->101|131->101|133->103|133->103|133->103|134->104|134->104|135->105|138->108|138->108|138->108|140->110|140->110|140->110|141->111|141->111|142->112|145->115|145->115|145->115|147->117|147->117|147->117|148->118|148->118|149->119|152->122|152->122|152->122|154->124|154->124|154->124|155->125|155->125|156->126|160->130|160->130|160->130|165->135|174->144|174->144|174->144|183->153|183->153|184->154|184->154|185->155|185->155|186->156|186->156|187->157|187->157|188->158|188->158|196->166|196->166|196->166|199->169|199->169|199->169|202->172|202->172|202->172|205->175|205->175|205->175|208->178|208->178|208->178|211->181|211->181|211->181|220->190|226->196|226->196|227->197|227->197|228->198|228->198|229->199|229->199|230->200|230->200|238->208|238->208|242->212|242->212|245->215|245->215|248->218|248->218|251->221|251->221|260->230|260->230|260->230|260->230|260->230|260->230|260->230|260->230|262->232|262->232|267->237|267->237|270->240|271->241
                    -- GENERATED --
                */
            