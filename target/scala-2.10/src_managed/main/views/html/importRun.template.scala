
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
object importRun extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Run],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(runForm: Form[Run]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/homeSkeleton/*7.14*/ {_display_(Seq[Any](format.raw/*7.16*/("""
	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.63*/routes/*8.69*/.Assets.at("stylesheets/datepicker.css"))),format.raw/*8.109*/("""">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src='"""),_display_(Seq[Any](/*10.39*/routes/*10.45*/.Assets.at("js/bootstrap-datepicker.js"))),format.raw/*10.85*/("""' charset="utf-8"></script>
 	
 
	<!-- bootbox code -->
	<script src=""""),_display_(Seq[Any](/*14.16*/routes/*14.22*/.Assets.at("js/bootbox.min.js"))),format.raw/*14.53*/(""""></script>
	<script type="text/javascript">
	function checkForm()"""),format.raw/*16.22*/("""{"""),format.raw/*16.23*/("""
		if (document.newRun.version_name.value == "")"""),format.raw/*17.48*/("""{"""),format.raw/*17.49*/("""
			alert("Please select a Version");
			return false;
		"""),format.raw/*20.3*/("""}"""),format.raw/*20.4*/("""
		else if ( document.newRun.format_id.value == "")"""),format.raw/*21.51*/("""{"""),format.raw/*21.52*/("""
			alert("Please select a File Format");
		return false;
		"""),format.raw/*24.3*/("""}"""),format.raw/*24.4*/("""
		else"""),format.raw/*25.7*/("""{"""),format.raw/*25.8*/("""
			return verifySubmit();
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/("""
	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/("""
	function getSelectedValue(elementId)"""),format.raw/*29.38*/("""{"""),format.raw/*29.39*/("""
		return document.getElementById(elementId).options[document.getElementById(elementId).selectedIndex].text;
	"""),format.raw/*31.2*/("""}"""),format.raw/*31.3*/("""
	function getPlatform(path)"""),format.raw/*32.28*/("""{"""),format.raw/*32.29*/("""
		pathArray=path.split("\\");
		var platformIndex=4; //this is in which spot the platform comes up in file name \\1\2\3...
		if(path.toLowerCase().contains("\\d\\"))"""),format.raw/*35.43*/("""{"""),format.raw/*35.44*/("""
			indexOfPlatform = 5;
		"""),format.raw/*37.3*/("""}"""),format.raw/*37.4*/("""
		return pathArray[platformIndex];
	"""),format.raw/*39.2*/("""}"""),format.raw/*39.3*/("""
	function verifySubmit()"""),format.raw/*40.25*/("""{"""),format.raw/*40.26*/("""
		//Get all current values at this time
		var runName=document.newRun.name.value;
		var runPath=document.newRun.path.value;
		var platform=getPlatform(runPath);
		var version=getSelectedValue("version_name");
		var format=getSelectedValue("format_id");
		var date=document.newRun.dp1.value;
		var svn=document.newRun.svn_num.value;
		
		var message="Are you sure you would like to submit this run?";
		//Prompt for confirmation
			var x=confirm("Run Name = "+runName+"\n"+
				"Run Path = "+runPath+"\n"+
				"Platform = "+platform+"\n"+
				"Version = "+version+"\n"+
				"Format = "+format+"\n"+
				"Date = "+date+"\n"+
				"SVN = "+svn+"\n"+
				message);
			if (x==true)"""),format.raw/*60.16*/("""{"""),format.raw/*60.17*/("""	
				document.newRun.submit();
			"""),format.raw/*62.4*/("""}"""),format.raw/*62.5*/("""
			else"""),format.raw/*63.8*/("""{"""),format.raw/*63.9*/("""
				return false;
			"""),format.raw/*65.4*/("""}"""),format.raw/*65.5*/("""
		return true;
	"""),format.raw/*67.2*/("""}"""),format.raw/*67.3*/("""

	function addVersion()"""),format.raw/*69.23*/("""{"""),format.raw/*69.24*/("""
		var versionName = prompt("What is the new version?(Platorm [java or native] will be added automatically");
	
		var x=document.getElementById("version_name");
		var option=document.createElement("option");
		option.text=versionName;
		try"""),format.raw/*75.6*/("""{"""),format.raw/*75.7*/("""// for IE earlier than version 8
			x.add(option,x.options[null]);
		"""),format.raw/*77.3*/("""}"""),format.raw/*77.4*/("""
		catch (e)"""),format.raw/*78.12*/("""{"""),format.raw/*78.13*/("""
			x.add(option,null);
		"""),format.raw/*80.3*/("""}"""),format.raw/*80.4*/("""
		x.selectedIndex=x.length-1; //select new version
		return false;
		
	"""),format.raw/*84.2*/("""}"""),format.raw/*84.3*/("""
	function autoFill()"""),format.raw/*85.21*/("""{"""),format.raw/*85.22*/("""
		var runPath=document.newRun.path.value;
		if(runPath=="")"""),format.raw/*87.18*/("""{"""),format.raw/*87.19*/("""
			return false;
		"""),format.raw/*89.3*/("""}"""),format.raw/*89.4*/("""
		var info=runPath.split("\\");//split into array with \ as delimiter
		var runName=info[info.length-2];
		var format=runName.substring(runName.lastIndexOf("-")+1);
		if(format.contains("."))"""),format.raw/*93.27*/("""{"""),format.raw/*93.28*/("""//If has ".Nightly" or something of the sort
			format=format.substring(0,format.lastIndexOf("."));
		"""),format.raw/*95.3*/("""}"""),format.raw/*95.4*/("""
		var version=runName.substring(0,runName.lastIndexOf("-"));
		
		//Set run name
		document.newRun.name.value=runName;
		
		//Set version
		var x=document.getElementById("version_name");
		for (var i = 0; i < x.options.length; i++) """),format.raw/*103.46*/("""{"""),format.raw/*103.47*/("""
			//alert("Testing if "+version+" = "+x.options[i].text+"\n"+(x.options[i].text == version));
			if (x.options[i].text == version) """),format.raw/*105.38*/("""{"""),format.raw/*105.39*/("""
				x.selectedIndex = i;
				break;
			"""),format.raw/*108.4*/("""}"""),format.raw/*108.5*/("""
		"""),format.raw/*109.3*/("""}"""),format.raw/*109.4*/("""
		if(x.selectedIndex==0)"""),format.raw/*110.25*/("""{"""),format.raw/*110.26*/("""//Version not found, create new one
			var option=document.createElement("option");
			option.text=version;
			try"""),format.raw/*113.7*/("""{"""),format.raw/*113.8*/("""// for IE earlier than version 8
				x.add(option,x.options[null]);
			"""),format.raw/*115.4*/("""}"""),format.raw/*115.5*/("""
			catch (e)"""),format.raw/*116.13*/("""{"""),format.raw/*116.14*/("""
				x.add(option,null);
			"""),format.raw/*118.4*/("""}"""),format.raw/*118.5*/("""
			x.selectedIndex=x.length-1; //select new version
		"""),format.raw/*120.3*/("""}"""),format.raw/*120.4*/("""
		//alert(x.selectedIndex);
		
		//Set format
		var x=document.getElementById("format_id");
		for (var i = 0; i < x.options.length; i++) """),format.raw/*125.46*/("""{"""),format.raw/*125.47*/("""
			//alert("Testing if "+format+" = "+x.options[i].text+"\n"+(x.options[i].text == format));
			if (x.options[i].text == format) """),format.raw/*127.37*/("""{"""),format.raw/*127.38*/("""
				x.selectedIndex = i;
				break;
			"""),format.raw/*130.4*/("""}"""),format.raw/*130.5*/("""
		"""),format.raw/*131.3*/("""}"""),format.raw/*131.4*/("""
		
		return false;
	"""),format.raw/*134.2*/("""}"""),format.raw/*134.3*/("""
	$(function()"""),format.raw/*135.14*/("""{"""),format.raw/*135.15*/("""//for picking a date
		$('#dp1').datepicker("""),format.raw/*136.24*/("""{"""),format.raw/*136.25*/("""
			format: 'yyyy-mm-dd'
		"""),format.raw/*138.3*/("""}"""),format.raw/*138.4*/(""");
	"""),format.raw/*139.2*/("""}"""),format.raw/*139.3*/(""");
	</script>
	
	
    <h1>Import an existing regression run</h1>
    
    <form name=newRun action=""""),_display_(Seq[Any](/*145.32*/routes/*145.38*/.AddToDB.saveRun())),format.raw/*145.56*/("""" method="POST" >    
        <fieldset>
		
        	<div class="clearfix ">
				<label for="path">Path to Issues folder</label>
				<div class="input">
					<input type="text" class="largerBox" id="path" name="path" onchange="return autoFill()" value="" required pattern="..(S|s)nowtest.*(R|r)egression.(java|native).*(I|i)ssues.*">
					<span class="help-inline">Required. ex: "\\snowtest\D\Regression\java\Trunk\trunk-2013-12-01-Test\Issues.13.6Build1-DOC" <br />
					Must begin with \\snowtest(\D)?\Regression\(java or native)\....\Issues*"</span> 
				</div>
			</div>
			
            <div class="clearfix">
				<label for="name">Run Name</label>
				<div class="input">
					<input id="name" type="text" value="" name="name" required pattern="(\w|\s|\.|-)+">
					<span class="help-inline">Required, only word characters</span>
				</div>
			</div>
			
			<div class="clearfix ">
				<label for="version_name">Version</label>
				<div class="input">
				<select id="version_name" name="version.name" >
					<option class="blank" value="">-- Choose a Version --</option>
					"""),_display_(Seq[Any](/*170.7*/for((key, value) <- Version.options()) yield /*170.45*/{_display_(Seq[Any](format.raw/*170.46*/("""
						<option value=""""),_display_(Seq[Any](/*171.23*/value)),format.raw/*171.28*/("""">"""),_display_(Seq[Any](/*171.31*/value)),format.raw/*171.36*/("""</option>
					""")))})),format.raw/*172.7*/("""
				</select>
				<button class="btn" onclick="return addVersion()">Add new version...</button>
				<span class="help-inline">Required</span>
				</div>
			</div>
			
			<div class="clearfix ">
				<label for="format_id">Format</label>
				<div class="input">
				<select id="format_id" name="format.id" >
					<option class="blank" value="">-- Choose a Format --</option>
					"""),_display_(Seq[Any](/*184.7*/for((key, value) <- FileFormat.options()) yield /*184.48*/{_display_(Seq[Any](format.raw/*184.49*/("""
						<option value=""""),_display_(Seq[Any](/*185.23*/key)),format.raw/*185.26*/("""">"""),_display_(Seq[Any](/*185.29*/value)),format.raw/*185.34*/("""</option>
					""")))})),format.raw/*186.7*/("""
				</select>
					<span class="help-inline">Required</span> 
				</div>
			</div>
			
			<div class="clearfix ">
				<label for="date_name">Date</label>
				<div class="datepicker input">
					<input type="date" class="datepicker" id="dp1" data-date-format="yyyy-mm-dd" name="date.name" value="" required pattern="\d"""),format.raw/*195.129*/("""{"""),format.raw/*195.130*/("""4"""),format.raw/*195.131*/("""}"""),format.raw/*195.132*/("""-\d"""),format.raw/*195.135*/("""{"""),format.raw/*195.136*/("""2"""),format.raw/*195.137*/("""}"""),format.raw/*195.138*/("""-\d"""),format.raw/*195.141*/("""{"""),format.raw/*195.142*/("""2"""),format.raw/*195.143*/("""}"""),format.raw/*195.144*/("""" >
				</div>
			</div>
			
			<div class="clearfix ">
				<label for="svn_num">SVN</label>
				<div class="input">
				<input type="text" id="svn_num" name="svn.num" value="" pattern="\d*">
					<span class="help-inline">Not Required (Numbers only)</span> 
				</div>
			</div>
			
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this run" class="btn primary" onclick="return checkForm()"> or 
            <a href=""""),_display_(Seq[Any](/*211.23*/routes/*211.29*/.Application.index())),format.raw/*211.49*/("""" class="btn">Cancel</a> 
        </div>
        
    </form>
    
""")))})))}
    }
    
    def render(runForm:Form[Run]): play.api.templates.Html = apply(runForm)
    
    def f:((Form[Run]) => play.api.templates.Html) = (runForm) => apply(runForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 19 12:19:51 EST 2013
                    SOURCE: C:/Users/dhallahan/workspace/regressionsiteRnd2-1/eclipse-regressionsite/app/views/importRun.scala.html
                    HASH: f3e7e7547e67dee7c475e4b52f38af711e6edb1f
                    MATRIX: 730->1|836->46|868->70|952->21|982->43|1011->124|1051->130|1071->142|1110->144|1209->208|1223->214|1285->254|1455->388|1470->394|1532->434|1643->509|1658->515|1711->546|1807->614|1836->615|1913->664|1942->665|2029->725|2057->726|2137->778|2166->779|2256->842|2284->843|2319->851|2347->852|2405->883|2433->884|2463->887|2491->888|2558->927|2587->928|2726->1040|2754->1041|2811->1070|2840->1071|3037->1240|3066->1241|3122->1270|3150->1271|3216->1310|3244->1311|3298->1337|3327->1338|4051->2034|4080->2035|4144->2072|4172->2073|4208->2082|4236->2083|4287->2107|4315->2108|4361->2127|4389->2128|4443->2154|4472->2155|4745->2401|4773->2402|4871->2473|4899->2474|4940->2487|4969->2488|5024->2516|5052->2517|5155->2593|5183->2594|5233->2616|5262->2617|5352->2679|5381->2680|5430->2702|5458->2703|5682->2899|5711->2900|5842->3004|5870->3005|6140->3246|6170->3247|6334->3382|6364->3383|6435->3426|6464->3427|6496->3431|6525->3432|6580->3458|6610->3459|6755->3576|6784->3577|6885->3650|6914->3651|6957->3665|6987->3666|7045->3696|7074->3697|7159->3754|7188->3755|7360->3898|7390->3899|7551->4031|7581->4032|7652->4075|7681->4076|7713->4080|7742->4081|7794->4105|7823->4106|7867->4121|7897->4122|7971->4167|8001->4168|8058->4197|8087->4198|8120->4203|8149->4204|8293->4311|8309->4317|8350->4335|9494->5443|9549->5481|9589->5482|9650->5506|9678->5511|9718->5514|9746->5519|9795->5536|10223->5928|10281->5969|10321->5970|10382->5994|10408->5997|10448->6000|10476->6005|10525->6022|10882->6349|10913->6350|10944->6351|10975->6352|11008->6355|11039->6356|11070->6357|11101->6358|11134->6361|11165->6362|11196->6363|11227->6364|11756->6856|11772->6862|11815->6882
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|38->10|42->14|42->14|42->14|44->16|44->16|45->17|45->17|48->20|48->20|49->21|49->21|52->24|52->24|53->25|53->25|55->27|55->27|56->28|56->28|57->29|57->29|59->31|59->31|60->32|60->32|63->35|63->35|65->37|65->37|67->39|67->39|68->40|68->40|88->60|88->60|90->62|90->62|91->63|91->63|93->65|93->65|95->67|95->67|97->69|97->69|103->75|103->75|105->77|105->77|106->78|106->78|108->80|108->80|112->84|112->84|113->85|113->85|115->87|115->87|117->89|117->89|121->93|121->93|123->95|123->95|131->103|131->103|133->105|133->105|136->108|136->108|137->109|137->109|138->110|138->110|141->113|141->113|143->115|143->115|144->116|144->116|146->118|146->118|148->120|148->120|153->125|153->125|155->127|155->127|158->130|158->130|159->131|159->131|162->134|162->134|163->135|163->135|164->136|164->136|166->138|166->138|167->139|167->139|173->145|173->145|173->145|198->170|198->170|198->170|199->171|199->171|199->171|199->171|200->172|212->184|212->184|212->184|213->185|213->185|213->185|213->185|214->186|223->195|223->195|223->195|223->195|223->195|223->195|223->195|223->195|223->195|223->195|223->195|223->195|239->211|239->211|239->211
                    -- GENERATED --
                */
            