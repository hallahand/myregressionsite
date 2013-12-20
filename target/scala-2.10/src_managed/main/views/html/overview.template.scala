
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
object overview extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {
def /*1.2*/link/*1.6*/(f1:String, f2:String, p1:String, p2:String ) = {{
    
    
    
    // Generate the link
    routes.Application.dataList(f1, f2, p1, p2)
    
}};
Seq[Any](format.raw/*8.2*/("""



"""),_display_(Seq[Any](/*12.2*/homeSkeleton/*12.14*/{_display_(Seq[Any](format.raw/*12.15*/("""
<!DOCTYPE html>
  <html>
  <style>
p
"""),format.raw/*17.1*/("""{"""),format.raw/*17.2*/("""

"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""
p.padding
"""),format.raw/*21.1*/("""{"""),format.raw/*21.2*/("""
padding-top:25px;
padding-bottom:25px;
padding-right:50px;
padding-left:50px;
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""
</style>
  <head>
      <meta charset="utf-8">
      <script type="text/javascript" src=""""),_display_(Seq[Any](/*30.44*/routes/*30.50*/.Application.javascriptRoutes())),format.raw/*30.81*/(""""></script>
      <script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
      <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*32.53*/routes/*32.59*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*32.102*/("""">
      <script type="text/javascript" src=""""),_display_(Seq[Any](/*33.44*/routes/*33.50*/.Assets.at("js/jquery.chained.min.js"))),format.raw/*33.88*/("""" charset="utf-8"></script>
      <script type="text/javascript" src=""""),_display_(Seq[Any](/*34.44*/routes/*34.50*/.Application.javascriptRoutes())),format.raw/*34.81*/(""""></script>
   </head>
   
   
   <center>
   <h1>Regression Testing Overview</h1>
   <p class="padding"></p>
   <body>
      
      
      <!-- The following code is dropdown menus. However, it uses
      the jquery library "chained select", so it might be a bit difficult to understand.
      Here is the basic idea. The first list gets all the platforms (calls a java function)
      and gives them a class based on their name. The second list gets all the formats and gives 
      them a class based on their name(i.e. Microsoft Word). 
      
      Now this sets up the last option. The last option will call every single run. However, it 
      will only display the run if the run shares the same format and platform. It does this by
      calling a function in Run, getPlatformFormat. This function just returns a string of
      the run's platform and format. Jquery checks to see that all the (option) classes are 
      the same.
      
      If you didn't get that, pretty much: class of the first drop down + class of the second drop down
	  must equal the class of third drop down. That is how jquery chained select works. 
	  
	  There are minor variations, but that's the basic idea.
      
      
      -->
      
      
      
      <select id="platform" name="#platform" onchange= "change('platform','format', 'pf')">
           <option value="Please select Platform">Please select Platform</option>
			"""),_display_(Seq[Any](/*68.5*/for(plat <- Platform.getList) yield /*68.34*/ {_display_(Seq[Any](format.raw/*68.36*/("""
           <option value="""),_display_(Seq[Any](/*69.27*/plat/*69.31*/.getPlatformName)),format.raw/*69.47*/(""" class = """),_display_(Seq[Any](/*69.57*/plat/*69.61*/.getPlatformName)),format.raw/*69.77*/("""> """),_display_(Seq[Any](/*69.80*/plat/*69.84*/.getPlatformName)),format.raw/*69.100*/("""</option>
           """)))})),format.raw/*70.13*/("""
      </select>
      <select id="format" name="#format" onchange= "change('platform','format', 'pf')"> 
           <option value="Please select Format">Please select Format</option>
           """),_display_(Seq[Any](/*74.13*/for(form <- FileFormat.getList) yield /*74.44*/ {_display_(Seq[Any](format.raw/*74.46*/("""
           <option value="""),_display_(Seq[Any](/*75.27*/form/*75.31*/.getFileFormatName)),format.raw/*75.49*/("""  class ="""),_display_(Seq[Any](/*75.59*/form/*75.63*/.getFileFormatName)),format.raw/*75.81*/(""">"""),_display_(Seq[Any](/*75.83*/form/*75.87*/.getFileFormatName)),format.raw/*75.105*/("""</option>
           """)))})),format.raw/*76.13*/("""
      </select>
      <select id="run" name="#run">
             
           """),_display_(Seq[Any](/*80.13*/for(run <- Run.getList) yield /*80.36*/ {_display_(Seq[Any](format.raw/*80.38*/("""
           <option value="""),_display_(Seq[Any](/*81.27*/run/*81.30*/.getRunID)),format.raw/*81.39*/("""   class = """),_display_(Seq[Any](/*81.51*/run/*81.54*/.getPlatformFormat)),format.raw/*81.72*/(""">"""),_display_(Seq[Any](/*81.74*/run/*81.77*/.getRunName)),format.raw/*81.88*/("""</option>
           """)))})),format.raw/*82.13*/("""
           <option value="" name= "AllRuns">All Runs</option>
           <option value="" name = "last5">Last 5 Runs</option>
           <option value="" name = "last10">Last 10 Runs</option>
           
      </select>
      <input type = "button" id = "pf" value= "Search" class="btn primary" disabled
      	onclick = "NavigateToSite('platform','format','version.platform.name', 'format.name','run')"/>
       
      <p>
      
      OR
      </p>
       
       		<select id="platform2" name="#platform2" onchange= "buttonSel('platform2', 'pv')"> 
           		<option value="Please select Platform">Please select Platform</option>
					"""),_display_(Seq[Any](/*98.7*/for(plat <- Platform.getList) yield /*98.36*/ {_display_(Seq[Any](format.raw/*98.38*/("""
           		<option value="""),_display_(Seq[Any](/*99.29*/plat/*99.33*/.getPlatformName)),format.raw/*99.49*/(""" class = """),_display_(Seq[Any](/*99.59*/plat/*99.63*/.getPlatformName)),format.raw/*99.79*/("""> """),_display_(Seq[Any](/*99.82*/plat/*99.86*/.getPlatformName)),format.raw/*99.102*/("""</option>
           			""")))})),format.raw/*100.16*/("""
      		</select>
      		
      		<select id="version2" name="#version2" onchange= "buttonSel('version2', 'pv')">
           		<option value="">Please select Version</option>
           		"""),_display_(Seq[Any](/*105.15*/for(vers <- Version.getList) yield /*105.43*/ {_display_(Seq[Any](format.raw/*105.45*/("""
           		<option value="""),_display_(Seq[Any](/*106.29*/vers/*106.33*/.getVersionName)),format.raw/*106.48*/("""  class = """),_display_(Seq[Any](/*106.59*/vers/*106.63*/.getThePlatform.getPlatformName)),format.raw/*106.94*/(""">"""),_display_(Seq[Any](/*106.96*/vers/*106.100*/.getVersionName)),format.raw/*106.115*/("""</option>
           			""")))})),format.raw/*107.16*/("""
      		</select>
      		
      		
     	 	<select id="run2" name="#run2" >           
          		 """),_display_(Seq[Any](/*112.15*/for(run <- Run.getList) yield /*112.38*/ {_display_(Seq[Any](format.raw/*112.40*/("""
           		<option value="""),_display_(Seq[Any](/*113.29*/run/*113.32*/.getRunID)),format.raw/*113.41*/("""   class = """),_display_(Seq[Any](/*113.53*/run/*113.56*/.version.getVersionName)),format.raw/*113.79*/(""">"""),_display_(Seq[Any](/*113.81*/run/*113.84*/.getRunName)),format.raw/*113.95*/("""</option> 
           		""")))})),format.raw/*114.15*/("""
           		<option value="" name= "AllRuns">All Runs</option>
           		<option value="" name = "last5">Last 5 Runs</option>
           		<option value="" name = "last10">Last 10 Runs</option>
      		</select>
      		
      		<input type = "button" id = "pv" value= "Search" class="btn primary" 
       		onclick = "NavigateToSite('platform2','version2','version.platform.name', 'version.name','run2')"/>
      
     <p>
     OR
     </p>  
  
  			<select id="date" name="#date" onchange= "buttonSel('date', 'dSelect')">
          	 	<option value="Choose from Dates">Choose from dates</option>
           		"""),_display_(Seq[Any](/*129.15*/for(da <- models.Date.getListUsed) yield /*129.49*/ {_display_(Seq[Any](format.raw/*129.51*/("""
           		<option value="""),_display_(Seq[Any](/*130.29*/da/*130.31*/.getDateName)),format.raw/*130.43*/("""  class = """),_display_(Seq[Any](/*130.54*/da/*130.56*/.getDateName)),format.raw/*130.68*/(""">"""),_display_(Seq[Any](/*130.70*/da/*130.72*/.getDateName)),format.raw/*130.84*/("""</option>
           		""")))})),format.raw/*131.15*/("""
      		</select>
      		
      		
      		<select id="run3" name="#run3">
           		"""),_display_(Seq[Any](/*136.15*/for(run <- Run.getList) yield /*136.38*/ {_display_(Seq[Any](format.raw/*136.40*/("""
           		<option value="""),_display_(Seq[Any](/*137.29*/run/*137.32*/.getRunID)),format.raw/*137.41*/("""  class = """),_display_(Seq[Any](/*137.52*/run/*137.55*/.getDateName)),format.raw/*137.67*/(""">"""),_display_(Seq[Any](/*137.69*/run/*137.72*/.getRunName)),format.raw/*137.83*/("""</option>
           		""")))})),format.raw/*138.15*/("""
           		 
      		</select>
      		
      		
      		<input type = "button" id = "dSelect" value= "Search" class="btn primary" 
      		onclick = "dateRun('run3')"/>
 	<p>
 
    </p>
      

<script>
/**
 * Redirects to proper run data
 *  p1: param one (format.name, etc)
 *  p2: param two
 *	list1: The first list you're pulling a value from
 *	list2: The second list you're pulling a value from
 */
function NavigateToSite(list1,list2,p1,p2,id) """),format.raw/*158.47*/("""{"""),format.raw/*158.48*/("""
	
	var value = document.getElementById(id).value;
	var option = document.getElementById(id).options[document.getElementById(id).selectedIndex].text;
	var f1 = document.getElementById(list1).value;
	var f2 = document.getElementById(list2).value;
	
	if (value == "")"""),format.raw/*165.18*/("""{"""),format.raw/*165.19*/("""
		if (option == 'All Runs')"""),format.raw/*166.28*/("""{"""),format.raw/*166.29*/("""
		
		window.location = jsRoutes.controllers.Application.dataList(f1,f2,p1,p2).url ;
		"""),format.raw/*169.3*/("""}"""),format.raw/*169.4*/("""
		else if (option == 'Last 5 Runs')"""),format.raw/*170.36*/("""{"""),format.raw/*170.37*/("""
			
			window.location = jsRoutes.controllers.Application.recentRuns(f1,f2,p1,p2,5).url ;
		"""),format.raw/*173.3*/("""}"""),format.raw/*173.4*/("""
		else """),format.raw/*174.8*/("""{"""),format.raw/*174.9*/(""" // Last 10 runs
			window.location = jsRoutes.controllers.Application.recentRuns(f1,f2,p1,p2,10).url ;
		"""),format.raw/*176.3*/("""}"""),format.raw/*176.4*/("""
	"""),format.raw/*177.2*/("""}"""),format.raw/*177.3*/("""
	else """),format.raw/*178.7*/("""{"""),format.raw/*178.8*/("""
		
		window.location = jsRoutes.controllers.Application.getData(value).url ;
		
	"""),format.raw/*182.2*/("""}"""),format.raw/*182.3*/("""
	
	
"""),format.raw/*185.1*/("""}"""),format.raw/*185.2*/("""
 function dateRun(id) """),format.raw/*186.23*/("""{"""),format.raw/*186.24*/("""
		var value = document.getElementById(id).value;
		window.location = jsRoutes.controllers.Application.getData(value).url ;
	"""),format.raw/*189.2*/("""}"""),format.raw/*189.3*/("""
 /**
 These methods ensure that a button is disabled unless the 
 approriate fields are filled out.
 **/
 function buttonSel(doc1, doc2) """),format.raw/*194.33*/("""{"""),format.raw/*194.34*/("""
 	if (document.getElementById(doc1).selectedIndex == 0)
 		document.getElementById(doc2).disabled = true;
 	else
 	document.getElementById(doc2).disabled = false;
 	"""),format.raw/*199.3*/("""}"""),format.raw/*199.4*/("""
 function change(doc1, doc2, doc3) """),format.raw/*200.36*/("""{"""),format.raw/*200.37*/("""
	 	if (document.getElementById(doc1).selectedIndex == 0 || document.getElementById(doc2).selectedIndex == 0)
	 		document.getElementById(doc3).disabled = true;
	 	else
	 	document.getElementById(doc3).disabled = false;
	 	"""),format.raw/*205.4*/("""}"""),format.raw/*205.5*/("""
 
 
</script>
  
 
      
 

      <script language="JavaScript" type="text/javascript">
    /**
    This is what "chains" the the lists together. See full documentation:
    	http://www.appelsiini.net/projects/chained
    **/
      $("#run").chained("#platform, #format"); 
      $("#version2").chained("#platform2");
      $("#run2").chained("#version2"); 
      $("#run3").chained("#date"); 
      
      $('form').submit(function()"""),format.raw/*224.34*/("""{"""),format.raw/*224.35*/("""
    	    if($('#platform').val() == "" || $('#format').val() == "")"""),format.raw/*225.68*/("""{"""),format.raw/*225.69*/("""
    	        return false;
    	    """),format.raw/*227.10*/("""}"""),format.raw/*227.11*/("""
    	    """),format.raw/*228.10*/("""}"""),format.raw/*228.11*/(""");
      
      
      </script>

  </body>
 

  """),_display_(Seq[Any](/*236.4*/javaNative/*236.14*/ {_display_(Seq[Any](format.raw/*236.16*/("""
  
  """)))})),format.raw/*238.4*/("""

  <p>
  </p>
  """),_display_(Seq[Any](/*242.4*/runChart/*242.12*/ {_display_(Seq[Any](format.raw/*242.14*/("""

""")))})),format.raw/*244.2*/("""
</center>


       
           
      

""")))})))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 19 17:13:44 EST 2013
                    SOURCE: C:/tmp/myregressionsite/app/views/overview.scala.html
                    HASH: 93f465a33be821321645611beb8ffd63367b58dd
                    MATRIX: 774->1|785->5|966->157|1010->166|1031->178|1070->179|1140->222|1168->223|1199->227|1227->228|1267->241|1295->242|1406->326|1434->327|1565->422|1580->428|1633->459|1831->621|1846->627|1912->670|1995->717|2010->723|2070->761|2178->833|2193->839|2246->870|3738->2327|3783->2356|3823->2358|3887->2386|3900->2390|3938->2406|3984->2416|3997->2420|4035->2436|4074->2439|4087->2443|4126->2459|4181->2482|4417->2682|4464->2713|4504->2715|4568->2743|4581->2747|4621->2765|4667->2775|4680->2779|4720->2797|4758->2799|4771->2803|4812->2821|4867->2844|4986->2927|5025->2950|5065->2952|5129->2980|5141->2983|5172->2992|5220->3004|5232->3007|5272->3025|5310->3027|5322->3030|5355->3041|5410->3064|6104->3723|6149->3752|6189->3754|6255->3784|6268->3788|6306->3804|6352->3814|6365->3818|6403->3834|6442->3837|6455->3841|6494->3857|6553->3883|6786->4079|6831->4107|6872->4109|6939->4139|6953->4143|6991->4158|7039->4169|7053->4173|7107->4204|7146->4206|7161->4210|7200->4225|7259->4251|7404->4359|7444->4382|7485->4384|7552->4414|7565->4417|7597->4426|7646->4438|7659->4441|7705->4464|7744->4466|7757->4469|7791->4480|7850->4506|8520->5139|8571->5173|8612->5175|8679->5205|8691->5207|8726->5219|8774->5230|8786->5232|8821->5244|8860->5246|8872->5248|8907->5260|8965->5285|9098->5381|9138->5404|9179->5406|9246->5436|9259->5439|9291->5448|9339->5459|9352->5462|9387->5474|9426->5476|9439->5479|9473->5490|9531->5515|10035->5990|10065->5991|10366->6263|10396->6264|10454->6293|10484->6294|10602->6384|10631->6385|10697->6422|10727->6423|10851->6519|10880->6520|10917->6529|10946->6530|11082->6638|11111->6639|11142->6642|11171->6643|11207->6651|11236->6652|11350->6738|11379->6739|11415->6747|11444->6748|11497->6772|11527->6773|11683->6901|11712->6902|11884->7045|11914->7046|12113->7217|12142->7218|12208->7255|12238->7256|12494->7484|12523->7485|13007->7940|13037->7941|13135->8010|13165->8011|13233->8050|13263->8051|13303->8062|13333->8063|13427->8121|13447->8131|13488->8133|13529->8142|13587->8164|13605->8172|13646->8174|13683->8179
                    LINES: 28->1|28->1|36->8|40->12|40->12|40->12|45->17|45->17|47->19|47->19|49->21|49->21|54->26|54->26|58->30|58->30|58->30|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|96->68|96->68|96->68|97->69|97->69|97->69|97->69|97->69|97->69|97->69|97->69|97->69|98->70|102->74|102->74|102->74|103->75|103->75|103->75|103->75|103->75|103->75|103->75|103->75|103->75|104->76|108->80|108->80|108->80|109->81|109->81|109->81|109->81|109->81|109->81|109->81|109->81|109->81|110->82|126->98|126->98|126->98|127->99|127->99|127->99|127->99|127->99|127->99|127->99|127->99|127->99|128->100|133->105|133->105|133->105|134->106|134->106|134->106|134->106|134->106|134->106|134->106|134->106|134->106|135->107|140->112|140->112|140->112|141->113|141->113|141->113|141->113|141->113|141->113|141->113|141->113|141->113|142->114|157->129|157->129|157->129|158->130|158->130|158->130|158->130|158->130|158->130|158->130|158->130|158->130|159->131|164->136|164->136|164->136|165->137|165->137|165->137|165->137|165->137|165->137|165->137|165->137|165->137|166->138|186->158|186->158|193->165|193->165|194->166|194->166|197->169|197->169|198->170|198->170|201->173|201->173|202->174|202->174|204->176|204->176|205->177|205->177|206->178|206->178|210->182|210->182|213->185|213->185|214->186|214->186|217->189|217->189|222->194|222->194|227->199|227->199|228->200|228->200|233->205|233->205|252->224|252->224|253->225|253->225|255->227|255->227|256->228|256->228|264->236|264->236|264->236|266->238|270->242|270->242|270->242|272->244
                    -- GENERATED --
                */
            