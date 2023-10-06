# Event Buddy

## Projektni tim
(svi članovi tima moraju biti iz iste seminarske grupe)

Ime i prezime | E-mail adresa (FOI) | JMBAG | Github korisničko ime | Seminarska grupa
------------  | ------------------- | ----- | --------------------- | ----------------
Dominik Josipović | djosipovi21@foi.hr | 0016152387 | djosipovi21 | G02
Karlo Mikec | kmikec20@foi.hr | 0016151582 | kmikec20 | G02
Sebastijan Vinko | svinko21@foi.hr | 0016154724  | svinko21 | G02

## Opis domene
Projekt pokriva domenu obavještavanja korisnika aplikacije o budućim događajima (koncerti, seminari, radionice...) te mogućnosti prijave, rezervacije gostiju koji će gostovati na određenom događaju koji odaberu. Aplikacija radi tako da organizator događaja objavi događaj u aplikaciji tako da popuni obrazac u koje upisuje osnovne informacije o događaju (naziv, kratak opis, mjesto, vrijeme, broj mogućih sudionika). Na svaki događaj, organizator će moći pisati komentare koji će predstavljati kratke obavijesti ako se pojavi potreba za dodatnim informacijama korisnicima. Za svaku obavijest koje organizator napravi korisnicima će doći notifikacija na mobitelu. Korisnik će moći kliknuti na dobivenu notifikaciju te će moći napisati komentare na objavu organizatora. Slanje komentara neće izazvati slanje notifikacija korisnicima aplikacije, ali će organizator događaja dobiti ovakvu vrstu obavijesti. Organizator će moći uređivati napravljen događaj, moći će ga otkazati i premjestiti datum ili mjesto održavanja (također će korisnici koji su se pretplatili na događaj dobiti obavijest u obliku notifikacije o tome). U svojem pogledu aplikacije, organizator će moći i makivati korisnika s kreiranog događaja te će moći i određenom korisniku zabraniti pretplatu na događaj. Prilikom kreiranja događaja dodana će biti mogućnost postavljanja "Tagova" na događaj koji bi olakšali korisnicima aplikacije filtriranje i pretraživanje. Korisnici će moći pretraživati i filtrirati događaje koji su kreirani od strane organizatora, pretplatiti se na događaj, napustiti događaj i pisati komentare na događaj. Kreirana će biti posebna sekcija "Moji događaji" gdje će korisnik vidjeti na koje događaje se pretplatio. U toj sekciji prikazani će biti i završeni događaji kako bi korisnik imao uvid u povijest događaja na kojima je sudjelovao, ali neće na njih moći pisati komentare ili ih naknadno napustiti. Na početnom kranu korisniku će biti prikazani događaji na koje je pretplaćen koji će se uskoro održati. Korisnik će isto kao i organizator događaja moći vidjeti broj prijavljenih osoba na svaki događaj te pregledavati osobe koje su na tom događaju. U sustavu će biti još uloge "Moderator" i "Administrator". Moderator će moći upravljati događajima koje je bilo koji organizator kreirao na način da ih može sakriti ukoliko primijeti da objavljeni događaj nije prikladan za zajednicu. Organizatorima može biti oduzeta uloga organizatora od strane moderatora ako prekrši pravila zajednice objavljivanjem neprikladnih događaja. Moderator može dodati ulogu organizatora korisniku za kojeg se utvrdi da je pouzdana i ovlaštena osoba za organiziranje događaja. Takav korisnik mora poslati zahtjev u aplikaciji da želi postati organizator, a moderator ih treba odobriti. Uloga administratora ima sve ovlasti moderatora i organizatora, ali može mijenjati podatke na svakom kreiranom događaju, brisati komentare svakog korisnika bez obzira na kojem se događaju komentar nalazi. Administrator može i obrisati događaj (tako da više ne postoji u aplikaciji) Administrator, organizator i moderator mogu kreirati svoje događaje i pretplatiti se na tuđe. Svaka od uloga imat će mogućnost prebaciti se na ulogu običnog korisnika na način da odabere opciju "Pogled korisnika" npr. ako je osoba moderator, može mijenjati poglede u aplikaciji između pogleda moderator i korisnika, organizator između pogleda organizatora i korisnika itd. Korisnici će se morati registrirati kako bi pristupili aplikaciji, a imat će i opciju brisanja korisničkog računa.

## Specifikacija projekta

Oznaka | Naziv | Kratki opis | Odgovorni član tima
------ | ----- | ----------- | -------------------
F01 | Upravljanje korisničkim računom |  Korisnik se registrira u sustav na način da unosi svoje ime i prezime, adresu te dostupno korisničko ime, lozinku i ponavlja izabranu lozinku radi sigurnosti korisničkog računa. Korisnik se prijavljuje u aplikaciju na način da unosi svoje korisničko ime i lozinku. Korisnik na svojem profilu u aplikaciji može promijeniti lozinku i obrisati svoj korisnički račun. Lozinka se mijenja na način da se upisuje stara lozinka te se dva puta upisuje nova lozinka kao što je to slučaj kod registracije. | Karlo Mikec
F02 | Upravljanje obavijestima |  Obavijestima se može upravljati na način da ih se potpuno isključi u postavkama profila uključivanjem opcije "Isključi obavijesti aplikacije". Također korisnik može isključiti obavijesti pojedinog događaja tako da odabere događaj na koji se pretplatio i pritisne gumb "Isključi obavijesti" prilikom čega korisnik neće primati nikakve obavijesti koje imaju veze s tim događajem. | Sebastijan Vinko
F03 | Pregledavanje događaja | Korisnik može pregledavati događaje koji su kreirani te ima opcije pretraživanja i filtriranja događaja. Događaji mogu biti pretraženi prema naslovu te biti filtrirani prema datumu odvijanja, vremenu početka i završetka, mjestu kao i prema tagovima koje je organizator postavio. | Karlo Mikec
F04 | Pretplata na događaj | Pretplatu na događaj korisnik napravi tako da pritisne gumb "Pretplati se" kada otvori detalje događaja. Prilikom pretplate, korisnik će dobivati notifikacije o događaju (početak događaja, objave organizatora događaja) te će zauzeti mjesto na događaju. Korisnik može isključiti obavijesti pojedinog događaja pritiskom na gumb "Isključi obavijesti", također može napustiti događaj pritiskom na gumb "Napusti događaj" čime oslobađa svoje mjesto. | Dominik Josipović
F05 | Upravljanje događajem | Korisnik koji dodijeljenu ulogu organizatora može kreirati događaje pritiskom na gumb "Kreiraj događaj" prilikom čega mu se otvara forma u kojoj navodi naziv događaja, lokaciju, vrijeme početka, broj sudionika koji mogu sudjelovati na događaju, opis događaja te tagove kako bi korisnici lakše pronašli događaj. Organizator može urediti informacije o događaju te pregledavati korisnike koji su se pretplatili na događaj i ukoliko želi, može određene korisnike maknuti s liste ili čak zabraniti pristup događaju. Postoji opcija otkazivanja događaja ukoliko se utvrdi da se događaj iz određenog razloga ne može izvoditi. | Dominik Josipović
F06 | Nadziranje zajednice | Moderator će moći prilikom pregledavanja događaja sakriti događaj ukoliko utvrdi da je događaj neprikladan ili nekim slučajem krši pravila zajednice. Skriveni događaj neće se vidjeti u aplikaciji niti će korisnici dobivati nikakve obavijesti o njemu, također organizator događaja neće vidjeti svoj događaj. Ukoliko moderator utvrdi da organizator ne zaslužuje svoju ulogu, ima ovlasti maknuti mu ulogu organizatora pri čemu postaje običan korisnik. Administrator ima iste ovlasti kao i moderator te uz to još može napraviti sve izmjene na tuđim događajima kao što može organizator na svojem. Administrator može izmijeniti podatke događaja, dodavati/uklanjati sudionike događaja, sakriti događaj te čak i u potpunosti obrisati događaj. | Karlo Mikec
F07 | Pregledavanje svojih događaja | Korisnici će moći vidjeti svoje događaje na koje su se pretplatili. Organizatori će moći vidjeti vlastite kreirane događaje kao i one na koje su se pretplatili, moći će vidjeti i prošle događaje, ali ih neće moći uređivati ili postavljati objave na njih. Administrator može vidjeti sve događaje u sustavu, skrivene, istekle te će moći skrivene događaje ponovno prikazati ukoliko događaj nije "započeo", također može kreirati vlastiti događaj. Moderatori u ovom slučaju imaju iste privilegije kao i obični korisnici osim ako im nije dodijeljena uloga organizatora te u tom slučaju mogu i oni kreirati svoje događaje te vidjeti pod vlastitim događajima. | Sebastijan Vinko
F08 | Upravljanje korisničkim računima i ulogama | Administrator može bilo kojem korisniku dodijeliti ulogu organizatora i moderatora te iste oduzeti. Korisnik postaje organizatorom ukoliko pošalje zahtjev da želi postati organizator te mu tada administrator ili moderator mora odobriti zahtjev nakon čega se korisniku dodjeljuje uloga organizatora. Ulogu moderatora korisnik dobije na način da mu je dodijeli administrator. Moderator može organizatoru oduzeti ulogu. Korisnički račun može u isto vrijeme biti i moderator i organizator, razlika je u tome što korisnički račun koji ima samo ulogu moderatora neće moći kreirati događaje. | Dominik Josipović
F09 | Slanje notifikacija | Aplikacija će na mobilni uređaj slati notifikacije o početku događaja, kreiranoj objavi na događaju od strane organizatora, poslati će biti obavijest organizatoru ukoliko netko odgovori na njegovu objavu te će upozoriti sve sudionike koje su pretplaćene na događaj o početku događaja. Korisnici kojima je odobren zahtjev za organizatora također će dobiti obavijest o tome. | Sebastijan Vinko
F10 | Upravljanje zahtjevima za organizatora | Moderator i administrator će moći vidjeti zahtjeve korisnika da postanu organizatori. Za svakog korisnika vidjeti će jedan zahtjev na kojeg mogu kliknuti te vidjeti detalje upita korisnika. Moguće je odobriti zahtjev klikom na gumb "Odobri" ili "Odbij". Odobrenjem zahtjeva korisniku se dodjeljuje uloga organizatora te može kreirati svoje događaje i šalje mu se notifikacija potvrde. U suprotnom slučaju korisnik ne dobiva ulogu organizatora i šalje mu se notifikacija da mu je zahtjev odbijen. | Dominik Josipović
F11 | Davanje recenzija događajima | Svi korisnici koji su sudjelovali na događaju mogu dati recenziju događaju kada on završi. Korisnik pregledava događaje koji su završili, može kliknuti na događaj te daje ocjenu zahtjevu. Na taj način omogućeno je ostalim korisnicima da mogu vidjeti koliko dobre događaje radi pojedini organizator. Prilikom gledanja detalja događaja koji nije započeo moguće je pregledati profil organizatora na kojem će biti prikazani njegovi prethodni događaji te će se tada na pojedinom događaju moći vidjeti ocjena koju su mu sudionici dodijelili. | Karlo Mikec

## Tehnologije i oprema
Projekt se fokusira na razvoj mobilne aplikacije za informiranje o budućim događajima, koja će omogućiti korisnicima pravovremene informacije o nadolazećim događajima. Aplikacija će biti razvijena koristeći najnovije tehnologije i alate kako bi se osigurala izvrsna korisnička iskustva.

Programski jezik Kotlin: Kotlin će biti glavni programski jezik korišten za razvoj aplikacije. Kotlin je moderni programski jezik koji je specifično dizajniran za Android platformu, pružajući visoku produktivnost i performanse.

Android Studio: Android Studio će biti glavno razvojno okruženje koje će se koristiti za izradu aplikacije. Android Studio pruža bogat skup alata i resursa za razvoj Android aplikacija, uključujući emulator za testiranje i optimizaciju performansi aplikacije.

Baza podataka: Aplikacija će koristiti MySQL Workbench za modeliranje baze podataka i pohranu korisničkih podataka.
 
Git i GitHub: Za verzioniranje programskog koda koristit ćemo Git kao sustav za kontrolu verzija, a GitHub će nam biti platforma za rad na programskom rješenju i projektu u cjelini. Ovo će omogućiti timu da učinkovito surađuje na razvoju aplikacije, prati promjene i održava povijest razvoja.

## Baza podataka i web server
***"Trebamo bazu podataka i pristup serveru za PHP skripte"***

## .gitignore
Uzmite u obzir da je u mapi Software .gitignore konfiguriran za nekoliko tehnologija, ali samo ako će projekti biti smješteni direktno u mapu Software ali ne i u neku pod mapu. Nakon odabira konačne tehnologije i projekta obavezno dopunite/premjestite gitignore kako bi vaš projekt zadovoljavao kriterije koji su opisani u ReadMe.md dokumentu dostupnom u mapi Software.
