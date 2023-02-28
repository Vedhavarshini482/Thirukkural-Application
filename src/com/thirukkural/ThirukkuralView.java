package com.thirukkural;

import java.util.List;
import java.util.Scanner;

import com.thirukkural.dto.Properties;

public class ThirukkuralView implements ThirukkuralViewCallBack {

	private ThirukkuralControllerCallBack controller;
	private Scanner scanner = new Scanner(System.in);

	ThirukkuralView() {
		controller = new ThirukkuralController(this);
	}

	public static void main(String[] args) {
		new ThirukkuralView().showDetails();
	}

	public void showDetails() {
		System.out.println("Enter your choice");
		System.out.println("\n1.அறத்துப்பால்\n2.பொருட்பால்\n3.இன்பத்துப்பால்\n4.Exit");
		String choice = scanner.nextLine();
		switch (choice) {
		case "1":
			arathupaal();
			break;
		case "2":
			porutpaal();
			break;
		case "3":
			inbathupaal();
			break;
		case "4":
			exit();
		default:
			System.out.println("\n\n\t\tEnter a valid number\n\n");
		}

	}

	private void arathupaal() {
		System.out.println(
				"\n1.Display all thirukkural from arathupaal\n2.To Specific thirukkural\n3.To Display specific adhigaram\n4.Back\n5.Exit");
		String choice = scanner.nextLine();
		switch (choice) {
		case "1":
			controller.displayArathupaal();
			break;
		case "2":
			System.out.println("\nEnter kural number");
			String number = scanner.nextLine();
			if (Integer.parseInt(number) >= 1 && Integer.parseInt(number) <= 380)
				specificKural(number);
			else {
				System.out.println("\n\n\t\tEnter a valid number\n\n");
				arathupaal();
			}
			break;
		case "3":
			getArathupaal();
			break;
		case "4":
			showDetails();
			break;
		case "5":
			exit();
		default:
			System.out.println("\n\n\t\tEnter a valid number\n\n");
			arathupaal();
		}

	}

	private void specificKural(String number) {

		controller.getSpecificKural(number);
	}

	private void getArathupaal() {
		System.out.println("""
				1	கடவுள் வாழ்த்து	            The Praise of God	                Katavul Vaazhththu	Kurals
				2	வான்சிறப்பு	                The Blessing of Rain	            Vaansirappu	Kurals
				3	நீத்தார் பெருமை	            The Greatness of Ascetics	        Neeththaar Perumai	Kurals
				4	அறன் வலியுறுத்தல்	            Assertion of the Strength of Virtue	Aran Valiyuruththal	Kurals
				5	இல்வாழ்க்கை	                Domestic Life	                    Ilvaazhkkai	Kurals
				6	வாழ்க்கைத் துணைநலம்	        The Worth of a Wife	                Vaazhkkaith Thunainalam	Kurals
				7	மக்கட்பேறு / புதல்வரைப் பெறுதல்	The Wealth of Children	            Pudhalvaraip Perudhal	Kurals
				8	அன்புடைமை	                The Possession of Love	            Anpudaimai	Kurals
				9	விருந்தோம்பல்	                Hospitality	                        Virundhompal	Kurals
				10	இனியவைகூறல்	            The Utterance of Pleasant Words	    Iniyavaikooral	Kurals
				11	செய்ந்நன்றி அறிதல்	            Gratitude	                        Seynnandri Aridhal	Kurals
				12	நடுவு நிலைமை	            Impartiality	                    Natuvu Nilaimai	Kurals
				13	அடக்கமுடைமை	            The Possession of Self-restraint	Adakkamudaimai	Kurals
				14	ஒழுக்கமுடைமை	            The Possession of Decorum	        Ozhukkamudaimai	Kurals
				15	பிறனில் விழையாமை	        Not coveting another's Wife	        Piranil Vizhaiyaamai	Kurals
				16	பொறையுடைமை	            The Possession of Patience      	Poraiyudaimai	Kurals
				17	அழுக்காறாமை	                Not Envying	                        Azhukkaaraamai	Kurals
				18	வெஃகாமை	                Not Coveting	                    Veqkaamai	Kurals
				19	புறங்கூறாமை	                Not Backbiting	                    Purangooraamai	Kurals
				20	பயனில சொல்லாமை	        Against Vain Speaking	            Payanila Sollaamai	Kurals
				21	தீவினையச்சம்	                Dread of Evil Deeds	                Theevinaiyachcham	Kurals
				22	ஒப்புரவறிதல்	                Duty to Society	                    Oppuravaridhal	Kurals
				23	ஈகை	                   	    Giving	                            Eekai	Kurals
				24	புகழ்	                        Renown	                            Pukazh	Kurals
				25	அருளுடைமை	                Compassion	                        Aruludaimai	Kurals
				26	புலான்மறுத்தல்	                Abstinence from Flesh	            Pulaanmaruththal	Kurals
				27	தவம்	                      	Penance	                            Thavam	Kurals
				28	கூடாவொழுக்கம்	            Imposture	                        Koodaavozhukkam	Kurals
				29	கள்ளாமை	                    The Absence of Fraud	            Kallaamai	Kurals
				30	வாய்மை	                    Veracity	                        Vaaimai	Kurals
				31	வெகுளாமை	                Restraining Anger	                Vekulaamai	Kurals
				32	இன்னாசெய்யாமை	            Not doing Evil	                    Innaaseyyaamai	Kurals
				33	கொல்லாமை	                Not killing	                        Kollaamai	Kurals
				34	நிலையாமை	                Instability	                        Nilaiyaamai	Kurals
				35	துறவு	                    Renunciation	                    Thuravu	Kurals
				36	மெய்யுணர்தல்	                Truth-Conciousness	                Meyyunardhal	Kurals
				37	அவாவறுத்தல்	                Curbing of Desire	                Avaavaruththal	Kurals
				38	ஊழ்	                        Fate	                            Oozh	Kurals""");
		System.out.println("\nEnter the Number of Athikaram which does you want");
		String number = scanner.nextLine();
		if (Integer.parseInt(number) >= 1 && Integer.parseInt(number) <= 38)
			controller.getSpecificAthikaram(number);
		else {
			System.out.println("\n\n\t\tEnter a valid number\n\n");
			getArathupaal();
		}
	}

	private void porutpaal() {
		System.out.println(
				"\n1.Display all thirukkural from porutpaal\n2.To Specific thirukkural\n3.To Display specific adhigaram\n4.Back\n5.Exit");
		String choice = scanner.nextLine();
		switch (choice) {
		case "1":
			controller.displayPorutpaalpaal();
			break;
		case "2":
			System.out.println("\nEnter kural number");
			String number = scanner.nextLine();
			if (Integer.parseInt(number) >= 381 && Integer.parseInt(number) <= 1080)
				specificKural(number);
			else {
				System.out.println("\n\n\t\tEnter a valid number\n\n");
				arathupaal();
			}
			break;
		case "3":
			getPorutpaal();
			break;
		case "4":
			showDetails();
			break;
		case "5":
			exit();
		default:
			System.out.println("\nEnter a valid number");
			arathupaal();
		}

	}

	private void getPorutpaal() {
		System.out.println(
				"""
						39	இறைமாட்சி	                The Greatness of a King	                        Iraimaatchi	Kurals
						40	கல்வி	                    Learning	                                    Kalvi	Kurals
						41	கல்லாமை	                    Ignorance	                                    Kallaamai	Kurals
						42	கேள்வி	                    Hearing	                                        Kaelvi	Kurals
						43	அறிவுடைமை	                The Possession of Knowledge	                    Arivudaimai	Kurals
						44	குற்றங்கடிதல்	                The Correction of Faults	                    Kutrangatidhal	Kurals
						45	பெரியாரைத் துணைக்கோடல்	    Seeking the Aid of Great Men	                Periyaaraith Thunaikkotal	Kurals
						46	சிற்றினஞ்சேராமை	            Avoiding mean Associations	                    Sitrinanjeraamai	Kurals
						47	தெரிந்துசெயல்வகை	            Acting after due Consideration	                Therindhuseyalvakai	Kurals
						48	வலியறிதல்	                The Knowledge of Power	                        Valiyaridhal	Kurals
						49	காலமறிதல்	                Knowing the fitting Time	                    Kaalamaridhal	Kurals
						50	இடனறிதல்	                Knowing the Place	                            Idanaridhal	Kurals
						51	தெரிந்துதெளிதல்	            Selection and Confidence	                    Therindhudhelidhal	Kurals
						52	தெரிந்துவினையாடல்	        Selection and Employment	                    Therindhuvinaiyaatal	Kurals
						53	சுற்றந்தழால்	                Cherishing Kinsmen	                            Sutrandhazhaal	Kurals
						54	பொச்சாவாமை	                Unforgetfulness	                                Pochchaavaamai	Kurals
						55	செங்கோன்மை              	The Right Sceptre	                            Sengonmai	Kurals
						56	கொடுங்கோன்மை	            The Cruel Sceptre	                            Kotungonmai	Kurals
						57	வெருவந்தசெய்யாமை	        Absence of Terrorism	                        Veruvandhaseyyaamai	Kurals
						58	கண்ணோட்டம்	                Benignity                                       Kannottam	Kurals
						59	ஒற்றாடல்	                    Detectives	                                    Otraadal	Kurals
						60	ஊக்கமுடைமை	                Energy	                                        Ookkamudaimai	Kurals
						61	மடியின்மை	                Unsluggishness	                                Matiyinmai	Kurals
						62	ஆள்வினையுடைமை           	Manly Effort	                                Aalvinaiyudaimai	Kurals
						63	இடுக்கணழியாமை	            Hopefulness in Trouble	                        Idukkan  Azhiyaamai	Kurals
						64	அமைச்சு	                    The Office of Minister of state	                Amaichchu	Kurals
						65	சொல்வன்மை	                Power of Speech                             	Solvanmai	Kurals
						66	வினைத்தூய்மை	            Purity in Action	                            Vinaiththooimai	Kurals
						67	வினைத்திட்பம்	                Power in Action                             	Vinaiththitpam	Kurals
						68	வினைசெயல்வகை	            Modes of Action	                                Vinaiseyalvakai	Kurals
						69	தூது	                        The Envoy	                                    Thoodhu	Kurals
						70	மன்னரைச் சேர்ந்தொழுதல்	    Conduct in the Presence of the King	Mannaraich  Cherndhozhudhal	Kurals
						71	குறிப்பறிதல்	                The Knowledge of Indications	                Kuripparidhal	Kurals
						72	அவையறிதல்	                The Knowledge of the Council Chamber	        Avaiyaridhal	Kurals
						73	அவையஞ்சாமை	            Not to dread the Council	                    Avaiyanjaamai	Kurals
						74	நாடு	                        The Land	                                    Naadu	Kurals
						75	அரண்	                    The Fortification	                            Aran	Kurals
						76	பொருள்செயல்வகை	            Way of Accumulating Wealth	                    Porulseyalvakai	Kurals
						77	படைமாட்சி	                The Excellence of an Army	                    Padaimaatchi	Kurals
						78	படைச்செருக்கு	                Military Spirit                             	Pataichcherukku	Kurals
						79	நட்பு	                        Friendship	                                    Natpu	Kurals
						80	நட்பாராய்தல்	                Investigation in forming Friendships	        Natpaaraaidhal	Kurals
						81	பழைமை	                    Familiarity	                                    Pazhaimai	Kurals
						82	தீ நட்பு	                    Evil Friendship	                                Thee Natpu	Kurals
						83	கூடாநட்பு                   	Unreal Friendship	                            Kootaanatpu	Kurals
						84	பேதைமை	                    Folly	                                        Paedhaimai	Kurals
						85	புல்லறிவாண்மை	            Ignorance	                                    Pullarivaanmai	Kurals
						86	இகல்	                    Hostility	                                    Ikal	Kurals
						87	பகைமாட்சி	                The Might of Hatred	                            Pakaimaatchi	Kurals
						88	பகைத்திறந்தெரிதல்	            Knowing the Quality of Hate	                    Pakaiththirandheridhal	Kurals
						89	உட்பகை	                    Enmity within	                                Utpakai	Kurals
						90	பெரியாரைப் பிழையாமை	    Not Offending the Great	Periyaaraip             Pizhaiyaamai	Kurals
						91	பெண்வழிச்சேறல்	            Being led by Women	                            Penvazhichcheral	Kurals
						92	வரைவின்மகளிர்	            Wanton Women	                                Varaivinmakalir	Kurals
						93	கள்ளுண்ணாமை	            Not Drinking Palm-Wine	                        Kallunnaamai	Kurals
						94	சூது	                        Gambling	                                    Soodhu	Kurals
						95	மருந்து	                    Medicine	                                        Marundhu	Kurals
						96	குடிமை	                    Nobility	                                        Kutimai	Kurals
						97	மானம்	                    Honour	                                            Maanam	Kurals
						98	பெருமை	                    Greatness	                                        Perumai	Kurals
						99	சான்றாண்மை	                Perfectness	                                        Saandraanmai	Kurals
						100	பண்புடைமை	                Courtesy	                                        Panpudaimai	Kurals
						101	நன்றியில்செல்வம்	            Wealth without Benefaction	                        Nandriyilselvam	Kurals
						102	நாணுடைமை	                Shame	                                            Naanudaimai	Kurals
						103	குடிசெயல்வகை	                The Way of Maintaining the Family	                Kutiseyalvakai	Kurals
						104	உழவு	                    Farming	                                            Uzhavu	Kurals
						105	நல்குரவு	                    Poverty	                                            Nalkuravu	Kurals
						106	இரவு	                 	    Mendicancy	                                        Iravu	Kurals
						107	இரவச்சம்	                    The Dread of Mendicancy	                            Iravachcham	Kurals
						108	கயமை	                    Baseness	                                        Kayamai	Kurals""");
		System.out.println("\nEnter the Number of Athikaram which does you want");
		String number = scanner.nextLine();
		if (Integer.parseInt(number) >= 39 && Integer.parseInt(number) <= 108)
			controller.getSpecificAthikaram(number);
		else {
			System.out.println("\n\n\t\tEnter a valid number\n\n");
			getPorutpaal();
		}
	}

	private void inbathupaal() {
		System.out.println(
				"1.Display all thirukkural from inbathupaal\n2.To Specific thirukkural\n3.To Display specific adhigaram\n4.Back\n5.Exit");
		String choice = scanner.nextLine();
		switch (choice) {
		case "1":
			controller.displayInbathupaal();
			break;
		case "2":
			System.out.println("\nEnter kural number");
			String number = scanner.nextLine();
			if (Integer.parseInt(number) >= 1081 && Integer.parseInt(number) <= 1330)
				specificKural(number);
			else {
				System.out.println("\t\tEnter a valid number");
				arathupaal();
			}
			break;
		case "3":
			getInbathupaal();
			break;
		case "4":
			showDetails();
			break;
		case "5":
			exit();
		default:
			System.out.println("\t\tEnter a valid number");
			arathupaal();
		}

	}

	private void getInbathupaal() {
		System.out.println(
				"""
						109	தகையணங்குறுத்தல்	        The Pre-marital love	                    Thakaiyananguruththal	Kurals
						110	குறிப்பறிதல்	            Recognition of the Signs	                Kuripparidhal	Kurals
						111	புணர்ச்சிமகிழ்தல்	        Rejoicing in the Embrace	                Punarchchimakizhdhal	Kurals
						112	நலம்புனைந்துரைத்தல்	    The Praise of her Beauty	                Nalampunaindhuraiththal	Kurals
						113	காதற்சிறப்புரைத்தல்	        Declaration of Love's special Excellence	Kaadharsirappuraiththal	Kurals
						114	நாணுத்துறவுரைத்தல்	        The Abandonment of Reserve	                Naanuththuravuraiththal	Kurals
						115	அலரறிவுறுத்தல்	        The Announcement of the Rumour	            Alararivuruththal	Kurals
						116	பிரிவாற்றாமை	            Separation unendurable	                    Pirivaatraamai	Kurals
						117	படர்மெலிந்திரங்கல்	        Complainings	                            Patarmelindhirangal	Kurals
						118	கண்விதுப்பழிதல்	        Eyes consumed with Grief	                Kanvidhuppazhidhal	Kurals
						119	பசப்புறுபருவரல்	        The Pallid Hue	                            Pasapparuparuvaral	Kurals
						120	தனிப்படர்மிகுதி	        The Solitary Anguish	                    Thanippatarmikudhi	Kurals
						121	நினைந்தவர்புலம்பல்	        Sad Memories	                            Ninaindhavarpulampal	Kurals
						122	கனவுநிலையுரைத்தல்	    The Visions of the Night	                Kanavunilaiyuraiththal	Kurals
						123	பொழுதுகண்டிரங்கல்	    Lamentations at Eventide	                Pozhudhukantirangal	Kurals
						124	உறுப்புநலனழிதல்	        Wasting Away	                            Uruppunalanazhidhal	Kurals
						125	நெஞ்சொடுகிளத்தல்	        Soliloquy	                                Nenjotukilaththal	Kurals
						126	நிறையழிதல்	            Reserve Overcome	                        Niraiyazhidhal	Kurals
						127	அவர்வயின்விதும்பல்	        Mutual Desire	                            Avarvayinvidhumpal	Kurals
						128	குறிப்பறிவுறுத்தல்	        The Reading of the Signs	                Kuripparivuruththal	Kurals
						129	புணர்ச்சிவிதும்பல்	        Desire for Reunion	                         Punarchchividhumpal	Kurals
						130	நெஞ்சொடுபுலத்தல்	        Expostulation with Oneself	                Nenjotupulaththal	Kurals
						131	புலவி	                Pouting	                                    Pulavi	Kurals
						132	புலவி நுணுக்கம்	        Feigned Anger	                            Pulavi Nunukkam	Kurals
						133	ஊடலுவகை	            The Pleasures of Temporary Variance	        Oodaluvakai	Kurals""");
		System.out.println("\nEnter the Number of Athikaram which does you want");
		String number = scanner.nextLine();
		if (Integer.parseInt(number) >= 109 && Integer.parseInt(number) <= 133)
			controller.getSpecificAthikaram(number);
		else {
			System.out.println("\n\n\tEnter a valid number\n\n");
			getInbathupaal();
		}

	}

	private void exit() {
		System.out.println("\t\t\t\tThankyou :)");
		controller.exit();
		System.exit(0);
	}

	@Override
	public void arathupaalList(List<Properties> arathupaalList) {
		for (int i = 0; i < arathupaalList.size(); i++) {
			System.out.print(arathupaalList.get(i));
			System.out.println();
		}
		showDetails();
	}

	@Override
	public void printAthikaram(List<Properties> athikaram) {
		for (int i = 0; i < athikaram.size(); i++)
			System.out.println(athikaram.get(i));
		showDetails();
	}

	@Override
	public void printKural(Properties property) {
		System.out.println(property);
		showDetails();
	}

}