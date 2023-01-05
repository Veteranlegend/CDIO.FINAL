package Model;

import Model.Chance.*;

public class ChanceDeck {

    ChanceCard[] deck = new ChanceCard[40];

    public ChanceDeck() {
    }

    public ChanceCard[] createDeck(){
        deck[0] = new PayHotelHouse("Oliepriserne er steget, og De skal betale kr 500 pr hus og kr 2000 pr hotel", 500, 2000);
        deck[1] = new PayHotelHouse("Ejendomsskatten er steget. Ekstraudgifterne er: 800 kr pr hus, 2300 kr pr hotel.", 800, 2300)
        deck[2] = new WithdrawMoney("De har kørt frem for “fuldt stop”, Betal 1000 kroner i bøde", 1000);
        deck[3] = new WithdrawMoney("Betal 3000 for reparation af deres vogn", 3000);
        deck[4] = ew WithdrawMoney("Betal 3000 for reparation af deres vogn", 3000);
        deck[5] = new WithdrawMoney("De har købt 4 nye dæk til Deres vogn, betal kr 1000", 1000);
        deck[6] = new WithdrawMoney("De har fået en parkeringsbøde, betal kr 200 i bøde", 200);
        deck[7] = new WithdrawMoney("Betal for vognvask og smøring kr 300", 300);
        deck[8] = new WithdrawMoney("Betal deres bilforsikring, kr 1000", 1000);
        deck[9] = new WithdrawMoney("De har været udenlands og købt for mange smøger, betal kr 200 i told.", 200);
        deck[10] = new WithdrawMoney("Tandlægeregning, betal kr 2000.", 2000);
        deck[11] = new RecieveMoney("De har vundet i klasselotteriet. Modtag 500 kr.", 500);
        deck[12] = new RecieveMoney("De har vundet i klasselotteriet. Modtag 500 kr.", 500);
        deck[13] = new RecieveMoney("De modtager Deres aktieudbytte. Modtag kr 1000 af banken", 1000);
        deck[14] = new RecieveMoney("De modtager Deres aktieudbytte. Modtag kr 1000 af banken", 1000);
        deck[15] = new RecieveMoney("De modtager Deres aktieudbytte. Modtag kr 1000 af banken", 1000);
        deck[16] = new RecieveMoney("Kommunen har eftergivet et kvartals skat. Hæv i banken 3000 kr.", 3000);
        deck[17] = new RecieveMoney("De have en række med elleve rigtige i tipning, modtag kl 1000", 1000);
        deck[18] = new RecieveMoney("Grundet dyrtiden har De fået gageforhøjelse, modtag kr 1000.", 1000);
        deck[19] = new RecieveMoney("Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.", 1000);
        deck[20] = new RecieveMoney("Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.", 1000);
        deck[21] = new RecieveMoney("De har solg nogle gamle møbler på auktion. Modtag 1000 kr af banken.", 1000);
        deck[22] = new RecieveMoney("Værdien af egen avl fra nyttehaven udgør 200 som de modtager af banken", 200);
        deck[23] = new RecieveMoney("De modtager “Matador-legatet” på kr 40.000, men kun hvis værdier ikke overstiger 15.000 kr", 1500);
        deck[24] = new RecieveMoney("De har lagt penge ud til et sammenskudsgilde. Mærkværdigvis betaler alle straks. Modtag fra hver medspiller 500 kr.", 500);
        deck[25] = new MoveToField("Ryk frem til START", 500);
        deck[26] = new MoveToField("Ryk frem til START", 200);
        deck[27] = new MoveToField("Ryk tre felter frem", 200);
        deck[28] = new MoveToField("Ryk tre felter tilbage", 200);
        deck[29] = new MoveToField("Ryk tre felter tilbage", 200);
        deck[30] = new MoveToField("Ryk frem til Frederiksberg Allé. Hvis De passere START, indkasser da 4000 kr.", 200);
        deck[31] = new MoveToField("Ryk frem til det nærmeste rederi og betal ejeren to gange den leje han ellers er berettiget til, hvis selskabet ikke ejes af nogen kan De købe det af banken.", 200);
        deck[32] = new MoveToField("Ryk frem til det nærmeste rederi og betal ejeren to gange den leje han ellers er berettiget til, hvis selskabet ikke ejes af nogen kan De købe det af banken.", 200);
        deck[33] = new MoveToField("Tag med Mols-Linien, flyt brikken frem og hvis De passerer START indkassér da kr 4000.", 200);
        deck[34] = new MoveToField("Ryk frem til Grønningen, hvis De passerer start indkasser da kr 4000.", 200);
        deck[35] = new MoveToField("Ryk frem til Vimmelskaftet, hvis de passerer start indkasser da kr 4000.", 200);
        deck[36] = new MoveToField("Tag med den nærmeste færge, hvis de passerer start indkasser da kr 4000.", 200);
        deck[37] = new MoveToField("Ryk frem til Strandvejen. Hvis De passere START, indkasser da 4000 kr.", 200);
        deck[38] = new MoveToField("Tag til Rådhuspladsen", 200);
        deck[39] = new MoveToField("I anledning af kongens fødselsdag benådes De herved for fængsel. Dette kort kan opbevares indtil De får brug for det, eller De kan sælge det. (antal kort: 2)", 200);
        deck[40] = new MoveToField("Gå i fængsel, De indkasserer ikke 4000 kr for at passere start.", 200);
        deck[41] = new MoveToField("Gå i fængsel, De indkasserer ikke 4000 kr for at passere start.", 200);



    }

}
