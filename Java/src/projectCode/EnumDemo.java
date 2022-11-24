package projectCode;

//import projectCode.EnumDemo.indiaStatesCode;

public class EnumDemo {
	private enum indiaStatesCode {
		I_AP,I_AS,I_BR,
		I_DL,I_GJ,I_HP,
	//	I_HR,I_JK,I_KA,
	//	I_KL,I_KO,I_MH,
	//	I_MP,I_MU,I_NE,
	//	I_OR,I_PB,I_RJ,
	//	I_TN,I_UE,I_UW,
	//	I_WB
	}
	public static void main(String[] args) {
		System.out.println(indiaStatesCode.values().length);
		indiaStatesCode singleCode= indiaStatesCode.I_AP;
		System.out.println(singleCode);
		System.out.println(indiaStatesCode.I_AP);
		int i=0;
		for(indiaStatesCode code:indiaStatesCode.values()) {
			i++;
			System.out.println(i + "." + code + ";	");
		}
	}

}
