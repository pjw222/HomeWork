package HomeWork;

public class Characters 
{
	public String callSign;
	public String name;
	public String nationality;
	public String job;
	public String group;
	public int agentNumber;
	public Skill[] skill;
	
	public Characters(
			String callSign,
			String name,
			String nationality,
			String job,
			String group,
			int agentNumber)
	{
		this.callSign = callSign;
		this.name = name;
		this.nationality = nationality;
		this.job = job;
		this.group = group;
		this.agentNumber = agentNumber;
	}


	public static void main(String[] args)
	{	
		
		Characters raze = new Characters
				(
					"레이즈",
					"타야네 알베스",
					"브라질",
					"타격대",
					"일반인",
					12
			    );
		RazeSkill razeskill = new RazeSkill
				(
					    "폭발 로봇",
					    "폭발 로봇을 장착한다.",
					    "폭탄 로봇 출동!", 
						"액티브",
						null,
						null,
						300,
						60,
						5,
						80,
						0,
						0,
						0,
						0,
						0,
						0
						
				);
		System.out.println(raze.callSign);
		System.out.println();
	}
}
class Skill
{
	String name;
	String description;
	String speech;
	String type;
	String allySpeech;
	String enemySpeech;
	int credit;
	int skillHp;
	double duration;	
}
class RazeSkill extends Skill
{
	int maxDamage;
	int minDamage;
	int instantMaxDamage;
	int instantMinDamage;
	int maxDamageAfterArming;
	int minDamageAfterArming;
	int objectTargetDamage;

	
	public RazeSkill(
			         String name,
			         String description,
			         String speech,
			         String type,
			         String allySpeech,
			         String enemySpeech,
			         int credit,
			         int skillHp,
			         double duration,
			         int maxDamage,
			         int minDamage,
			         int instantMaxDamage,
			         int instantMinDamage,
			         int maxDamageAfterArming,
			         int minDamageAfterArming,
			         int objectTargetDamage
			        )
	{
		this.name = name;
		this.description = description;
		this.speech = speech;
		this.type = type;
		this.allySpeech = allySpeech;
		this.enemySpeech = enemySpeech;
		this.credit = credit;
		this.skillHp = skillHp;
		this.duration = duration;
		this.maxDamage = maxDamage;
		this.minDamage = minDamage;
		this.instantMaxDamage = instantMaxDamage;
		this.instantMinDamage = instantMinDamage;
		this.maxDamageAfterArming = maxDamageAfterArming;
		this.minDamageAfterArming = minDamageAfterArming;
		this.objectTargetDamage = objectTargetDamage;
		
	}
}


















