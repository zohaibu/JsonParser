/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zohaib.Usmani
 */
package claimtoobject;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Claim {

private String BeneficiaryId;
private String BeneficiaryZip;
private String IcdVersionIndicator;
private String LineNumber; 
private String PrimaryCarePhysicianYnFlag; 
        
private String DateOfService;
private String Hcpcs;
private String Modifier01;
private String Modifier02;
private String Units;
private String PlaceOfService;
private String Charges;
private String RenderingNpi;
private String RenderingTaxonomy;


public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("************************************");

    sb.append("\nBeneficiaryId: ").append(BeneficiaryId);
    sb.append("\nBeneficiaryZip: ").append(BeneficiaryZip);
    sb.append("\nIcdVersionIndicator: ").append(IcdVersionIndicator);
    sb.append("\nPrimaryCarePhysicianYnFlag: ").append(PrimaryCarePhysicianYnFlag);
    sb.append("\nLineNumber: ").append(LineNumber);
    sb.append("\nDateOfService: ").append(DateOfService);
    sb.append("\nHCPCS: ").append(Hcpcs);
    sb.append("\nModifier01: ").append(Modifier01);
    sb.append("\nModifier02: ").append(Modifier02);
    sb.append("\nUnits: ").append(Units);
    sb.append("\nPlaceOfService: ").append(PlaceOfService);
    sb.append("\nCharges: ").append(Charges);
    sb.append("\nRenderingNpi: ").append(RenderingNpi);
    sb.append("\nRenderingTaxonomy: ").append(RenderingTaxonomy);
    sb.append("\n************************************");
    return sb.toString();
}
//1
public String getBeneficiaryId() {
    return BeneficiaryId;
}
public void setBeneficiaryId(String BeneficiaryId) {
    this.BeneficiaryId = BeneficiaryId;
}
//2
public String getBeneficiaryZip() {
    return BeneficiaryZip;
}
public void setBeneficiaryZip(String BeneficiaryZip) {
    this.BeneficiaryZip = BeneficiaryZip;
}
//3

public String getIcdVersionIndicator() {
    return IcdVersionIndicator;
}
public void setIcdVersionIndicator(String IcdVersionIndicator) {
    this.IcdVersionIndicator = IcdVersionIndicator;
}
//4

public String getLineNumber() {
    return LineNumber;
}
public void setLineNumber(String LineNumber) {
    this.LineNumber = LineNumber;
}
//5
public String getPrimaryCarePhysicianYnFlag() {
    return PrimaryCarePhysicianYnFlag;
}
public void setPrimaryCarePhysicianYnFlag(String PrimaryCarePhysicianYnFlag) {
    this.PrimaryCarePhysicianYnFlag = PrimaryCarePhysicianYnFlag;
}
//6
public String getDateOfService() {
    return DateOfService;
}
public void setDateOfService(String DateOfService) {
    this.DateOfService = DateOfService;
}
//7
public String getHcpcs() {
    return Hcpcs;
}
public void seHcpcs(String Hcpcs) {
    this.Hcpcs = Hcpcs;
}
//8
public String getModifier01() {
    return Modifier01;
}
public void setModifier01(String Modifier01) {
    this.Modifier01 = Modifier01;
}
//9
public String getModifier02() {
    return Modifier02;
}
public void setModifier02(String Modifier02) {
    this.Modifier02 = Modifier02;
            }         
//10
public String getUnits() {
    return Units;
}
public void setUnits(String Units) {
    this.Units = Units;
}
//11
public String getPlaceOfService() {
    return PlaceOfService;
}
public void setPlaceOfService(String PlaceOfService) {
    this.PlaceOfService = PlaceOfService;
}
//12
public String getCharges() {
    return Charges;
}
public void setCharges(String Charges) {
    this.Charges = Charges;

}
//13
public String getRenderingNpi() {
    return RenderingNpi;
}
public void setgetRenderingNpi(String RenderingNpi) {
    this.RenderingNpi = RenderingNpi;
}
//14
public String getRenderingTaxonomy() {
    return Modifier02;
}
public void setRenderingTaxonomy(String RenderingTaxonomy) {
    this.RenderingTaxonomy = RenderingTaxonomy;
 }  
}