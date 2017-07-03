package org.opendevup;

import java.util.stream.Stream;

import org.opendevup.dao.SocieteRepository;
import org.opendevup.entities.Societe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ABourseSocieteServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ABourseSocieteServiceApplication.class, args);
		SocieteRepository societeRepository=ctx.getBean(SocieteRepository.class);
		Stream.of(
				"Maroc Telecom	",
				"S.a.m.i.r*	",
				"Banque centrale Populaire*	"	,
				"Bmce bank*	"	,
				"Lydec*	"	,
				"Centrale Danone	"	,
				"Wafa assurance*	"	,
				"Cosumar	"	,
				"Bmci*	"	,
				"Afriquia gaz	"	,
				"Saham assurances*	"	,
				"Addoha Douja Promotioin	"	,
				"Sonasid	"	,
				"Ciments du Maroc	"	,
				"Label Vie	"	,
				"Auto Hall	"	,
				"Delta Holding*	"	,
				"Marsa Maroc	"	,
				"Brasseries du Maroc	"	,
				"Crédit du Maroc*	"	,
				"Taqa Maroc - Jlec	"	,
				"C.i.h. bank*	"	,
				"Nexans Maroc	"	,
				"Oulmès	"	,
				"Auto-Nejma	"	,
				"Disway	"	,
				"Sothema	"	,
				"S.m.i.	"	,
				"Alliances développement immobilier*	"	,
				"Unimer	"	,
				"Aluminium du Maroc	"	,
				"Dlm	"	,
				"S.n.e.p.	"	,
				"S.r.m.	"	,
				"Fenie Brossette	"	,
				"Eqdom*	"	,
				"Colorado	"	,
				"Dari Couspate	"	,
				"Stokvis Nord-Afrique	"	,
				"Ctm	"	
					).forEach(s->societeRepository.save(new Societe(s)));
		societeRepository.findAll().forEach(s->System.out.println(s.getNomSociete()));
		
		
	}
}

     

