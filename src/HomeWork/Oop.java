package HomeWork;


public class Oop 
{

}
class Raze
{
	public String callSign = "레이즈";
	public String name = "타야네 알베스";
	public String nationality = "브라질";
	public String job = "타격대";
	public String group = "일반인";
	public int agentNumber = 12;
}
class RazeSkill
{
	public void SkillBoomRobot()
	{
		String skillName = "폭팔 로봇";
		String skillExplanation = "폭발 로봇을 장착합니다. 발사하면 폭발 로봇이 지면에서 일직선으로 이동하며 벽을 만나면 튕겨 나옵니다."
				                + "폭발 로봇의 정면 원뿔형 시야 안에 적이 포착되면 해당 적에게 돌진하며 폭발해 치명적인 피해를 입힙니다.";
		String speech="폭탄 로봇 출동!, 가서 잡아!";
		String skillType = "액티브";
		int maxDamage= 80;
		int[] rangeDamage = new int[80];
		for(int i=0;i<rangeDamage.length;i++)
		{
			rangeDamage[i]=i+1;
		}
		int duration = 5;
		int skillHp = 60;
		int credit = 300;		
	}
	public void SkillBlastPack()
	{
		String skillName = "폭팔 팩";
		String skillExplanation ="표면에 부착되는 폭발 팩을 던집니다. 부착 후 다시 사용하면 팩이 폭발하며 적중한 대상에게 피해를 입히고 밀어냅니다.";
		String speech = "폭탄,간다!, 폭탄,받아라!";
		String skillType = "액티브";
		int[] instantDamage = new int[11];
		for(int i=4;i<instantDamage.length; i++)
		{
			instantDamage[i]=i+1;
		}
		int[] DamageAfterArming = new int[26];
		for(int i=24;i<DamageAfterArming.length;i++)
		{
			DamageAfterArming[i]=i+1;
		}
		int objectTargetDamage = 75;
		int duration = 5;
		int skillHp = 20;
		int credit = 200;		
	}
	public void SkillPaintShells(int killCount)
	{
		String skillName = "페인트 탄";
		String skillExplanation = "집속탄을 장착합니다. 발사하면 집속탄을 던집니다."
				+ " 집속탄은 피해를 입히고 여러 개의 자탄을 퍼뜨립니다."
				+ " 자탄은 각각의 범위 내에 있는 모든 대상에게 피해를 입힙니다.";
		String speech= "수류탄!";
		String skillType = "액티브";
		int maxDamage = 55;
		int[] rangeDamage=new int[56];
		for(int i=0;i<rangeDamage.length;i++)
		{
			rangeDamage[i]=i+1;
		}
        if(killCount==2)
        {
        	System.out.println("스킬을 재사용 할수있습니다.");
        }
              
	}
	public void UltimateSkillShowStopper(int killCount)
	{
		String ultimateName = "대미 장식";
		String skillExplanation ="로켓 발사기를 장착합니다. 발사하면 충돌 시 대량의 범위 피해를 입히는 로켓을 발사합니다.";
		String allySpeech = "파티를 열어볼까? (Here comes the Party!)";
		String enemySpeech = "폭탄 받아라! (Fire in the Hole!)";
		String skillType = "궁극기";
		int maxDamage = 150;
		int[] rangeDamage = new int[151];
		for(int i=0;i<rangeDamage.length;i++)
		{
			rangeDamage[i]=i+1;
		}
		if(killCount==8)
		{
			System.out.println("궁국기가 충전 되었습니다.");
		}

	}


}
class Jett
{
	public String callSign = "제트";
	public String name = "한선우";
	public String nationality = "대한민국";
	public String job = "타격대";
	public String group = "레디언트";
	public int agentNumber = 10;
}
class JettSkill
{
	public void PassiveSkillDrift()
	{
		String skillName = "표류";
		String skillExplanation ="낙하 시 점프 버튼을 길게 누르면 활공합니다.";
		String skillType = "패시브";
	}
	public void SkillCloudburst()
	{
		String skillName = "연막 폭발";
		String skillExplanation = "표면에 닿아 충격을 받으면 구름으로 팽창해 잠시 시야를 가리는 투사체를 즉시 던집니다."
				+ " 스킬 키를 길게 누르면 연기가 조준점 방향으로 휘어집니다.";
		String speech = "시야 차단!";
		String skillType = "액티브";
		int maximumCharge = 2;
		int credit = 200;
		double duration = 4.5;
	}
	public void SkillUpdraft()
	{
		String skillName = "상승 기류";
		String skillExplanation = "제트가 즉시 높이 날아오릅니다.";
		String skillType = "액티브";
		int credit = 150;
	}
	public void SkillTailwind(int killCount)
	{
		String skillName = "순풍";
		String skillExplanation = "활성화 시 일정 시간 동안 돌풍을 준비합니다."
				+ " 돌풍을 다시 사용하면 제트가 이동 방향으로 빠르게 이동합니다."
				+ " 제트가 가만히 서 있을 경우에는 앞으로 빠르게 이동합니다.";
		String skillType = "액티브";
		double activationWaitTime = 0.75;
		int duration = 12;
        if(killCount==2)
        {
        	System.out.println("스킬을 재사용 할수있습니다.");
        }
         
	}
	public void UltimateSkillBladeStorm(int killCount, int kill, int shuriken)
	{
		String skillName = "칼날 폭풍";
		String skillExplanation = "명중률이 높은 투척용 단검을 장착합니다. "
				+ "발사하면 대상에게 단검 하나를 던지며,"
				+ " 처치 시 단검을 충전합니다. 보조 공격시 대상에게 남은 단검을 전부 던집니다. "
				+ "이 경우 처치 시 단검이 충전되지 않습니다. ";
		String allySpeech = "똑똑히 봐라! (Watch this!)";
		String skillType = "궁극기";
		String enemySpeech = "저리 비켜! (Get out of my way!)";
		int torsoDamage = 50;
		int legDamage = 42;
		int headDamage = 150;
	    if(killCount==7)
	    {
	    	
	        System.out.println("궁극기가 충전되었습니다.");
	        if(kill>=1)
	        {
	        	shuriken=5;
	        }
	    }
	    
	}
}
class Reyna
{
	public String callName = "레이나";
	public String name = "잔야 몬드라곤";
	public String nationality = "멕시코";
	public String job = "타격대";
	public String group = "레디언트";
	public int agentNumber = 11;
}
class ReynaSkill
{
	public void PassiveSkillSoulHarvest(int kill, int killSecond)
	{
		String skillName = "영혼 수확";
		String skillExplanation = "레이나가 처치하거나 레이나에게 피해를 입고 3초 이내에 죽은 적은 3초 동안 유지되는 영혼 구슬을 남깁니다.";
		String skillType = "패시브";
		if(kill>=1 && killSecond<=3)
		{
			int soulOrbDuration = 3;
		}		
	}
	public void SkillLeer()
	{
		String skillName = "눈총";
		String skillExplanation = "파괴 가능한 천상의 눈을 장착합니다. 활성화하면 눈을 짧게 앞으로 던집니다. 눈을 본 적은 모두 시야가 제한됩니다.";
		String speech = "\"시야를 훔치겠어.\", \"시야를 훔쳐주지!\", \"눈을 가리겠어.\", \"눈을 가려주지!\"";
		String ultiSpeech = "\"눈 먼 장님이로군.\", \"눈 감으랬지!\", \"눈 감아라.\"";
		String skillType = "액티브";
		int credit = 250;
		int skillHp = 100;
		int duration = 2;
	}
	public void SkillDevour(int lifeDrain)
	{
		String skillName = "포식";
		String skillExplanation = "	\r\n"
				+ "즉시 근처에 있는 영혼 구슬을 흡수하여 짧은 시간 동안 순식간에 체력을 회복합니다."
				+ " 이 스킬로 회복한 체력이 100을 넘어가면 초과분이 생기며 초과분은 시간이 흐르면서 사라집니다."
				+ " 여제가 활성화 시 이 스킬이 자동으로 사용되며 영혼 구슬을 흡수하지 않습니다.";
		String skillType = "액티브";
		int maximumCharge = 2;
		int credit = 200;
		int maximumLifeDrain = 100;
		int maximumHp = 150;
		if(lifeDrain>100)
		{
			lifeDrain-=100;
			int shield = lifeDrain;
		}
	}
	public void SkillDismiss()
	{
		String skillName = "무시";
		String skillExplanation = "즉시 근처에 있는 영혼 구슬을 흡수하여 짧은 시간 동안 무형 상태가 됩니다. 여제 활성화 시 추가로 투명 상태가 됩니다.";
		String skillType = "액티브";
		int maximumCarge = 2;
		int credit = 200;
		int duration = 2;		
	}
	public void UltimateSkillEmpress(int killCount, int kill, int killSecond)
	{
		String skillName = "여제";
		String skillExplanation = "즉시 광란 상태가 되어 사격, 장착, 재장전 속도가 크게 증가합니다."
				+ " 영혼 수확의 충전량을 무제한으로 얻습니다."
				+ " 레이나가 처치하거나 레이나에게 피해를 입고 3초 이내에 죽은 적이 있으면 지속시간이 초기화됩니다.";
		int rateOfFire = 15;
		int mounting = 25;
		int reloadSpeed = 25;
		int duration = 30;
	    if(killCount==6)
	    {
	        System.out.println("궁극기가 충전되었습니다.");
	        if(kill>=1 && killSecond<=3)
	        {
	        	duration = 30;
	        }
	    }
		
	}
}