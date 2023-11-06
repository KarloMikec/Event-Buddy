# Event Buddy

## Projektni tim
(svi članovi tima moraju biti iz iste seminarske grupe)

Ime i prezime | E-mail adresa (FOI) | JMBAG | Github korisničko ime | Seminarska grupa
------------  | ------------------- | ----- | --------------------- | ----------------
Dominik Josipović | djosipovi21@foi.hr | 0016152387 | djosipovi21 | G02
Karlo Mikec | kmikec20@foi.hr | 0016151582 | kmikec20 | G02
Sebastijan Vinko | svinko21@foi.hr | 0016154724  | svinko21 | G02

## Opis domene
Projekt pokriva domenu obavještavanja korisnika aplikacije o budućim događajima (koncerti, seminari, radionice...) te mogućnosti prijave, rezervacije gostiju koji će gostovati na određenom događaju koji odaberu. Aplikacija radi tako da organizator događaja objavi događaj u aplikaciji tako da popuni obrazac u koje upisuje osnovne informacije o događaju (naziv, kratak opis, mjesto, vrijeme, broj mogućih sudionika). Na svaki događaj, organizator će moći pisati komentare koji će predstavljati kratke obavijesti ako se pojavi potreba za dodatnim informacijama korisnicima. Za svaku obavijest koje organizator napravi korisnicima će doći notifikacija na mobitelu. Korisnik će moći kliknuti na dobivenu notifikaciju te će moći napisati komentare na objavu organizatora. Slanje komentara neće izazvati slanje notifikacija korisnicima aplikacije, ali će organizator događaja dobiti ovakvu vrstu obavijesti. Organizator će moći uređivati napravljen događaj, moći će ga otkazati i premjestiti datum ili mjesto održavanja (također će korisnici koji su se pretplatili na događaj dobiti obavijest u obliku notifikacije o tome). U svojem pogledu aplikacije, organizator će moći i makivati korisnika s kreiranog događaja te će moći i određenom korisniku zabraniti pretplatu na događaj. Korisnici će moći pretraživati i filtrirati događaje koji su kreirani od strane organizatora, pretplatiti se na događaj, napustiti događaj i pisati komentare na objavu organizatora. Kreirana će biti posebna sekcija "Moji događaji" gdje će korisnik vidjeti na koje događaje se pretplatio. U toj sekciji prikazani će biti i završeni događaji kako bi korisnik imao uvid u povijest događaja na kojima je sudjelovao, ali neće na njih moći pisati komentare ili ih naknadno napustiti. Na početnom kranu korisniku će biti prikazani događaji na koje je pretplaćen koji će se uskoro održati. Korisnik će isto kao i organizator događaja moći vidjeti broj prijavljenih osoba na svaki događaj te pregledavati osobe koje su na tom događaju. Korisnici će se morati registrirati kako bi pristupili aplikaciji, a imat će i opciju promjene podataka računa.

## Specifikacija projekta

Oznaka | Naziv | Kratki opis | Odgovorni član tima
------ | ----- | ----------- | -------------------
F01 | Prijava i registracija | Korisnik se registrira u sustav na način da unosi svoje ime i prezime, adresu te dostupno korisničko ime, lozinku i ponavlja izabranu lozinku radi sigurnosti korisničkog računa. Korisnik se prijavljuje u aplikaciju na način da unosi svoje korisničko ime i lozinku. | ???
F02 | Uređivanje računa | Korisnik na svojem profilu u aplikaciji može promijeniti lozinku. Lozinka se mijenja na način da se upisuje stara lozinka te se dva puta upisuje nova lozinka kao što je to slučaj kod registracije. Korisnik također može uređivati i svoje osobne podatke kao što su ime, prezime, adresa | ???
F03 | Slanje zahtjeva | Korisnik može zatražiti od administrativne strane ulogu organizatora. Korisnik sa svojeg profila odabire opciju slanja zahtjeva te ispunjava obrazac zašto bi on trebao postati organizator. Zahtjev se zatim šalje moderatoru/administratoru za daljnji pregled. | ???
F04 | Pregledavanje događaja | Korisnik može pregledavati današnje i buduće događaje u aplikaciji koji su kreirani od strane organizatora. | ???
F05 | Kreiranje događaja | Organizator će imati opciju kreiranja događaja u sekciji "Vlastiti događaji" prilikom čega mu se otvara forma u kojoj navodi naziv događaja, lokaciju, vrijeme početka, broj sudionika koji mogu sudjelovati na događaju. | ???
F06 | Uređivanje događaja | Prilikom odabira vlastitog događaja kojeg je organizator kreirao, prikazuju mu se detalji događaja koje može izmjenjivati. Podatke koje organizator može mijenjati su naziv događaja, datum, mjesto i vrijeme odvijanja, opis i otkazati događaj. | ???
F07 | Pretplata na događaj | Korisnik kod pregleda detalja odabranog događaja ima opciju pretplatiti se na taj odabrani događaj pritiskom na gumb "Pretplati se", ako ima slobodnih mjesta. Također korisnik može napustiti događaj pritiskom na gumb "Napusti događaj". | ???
F08 | Pregled svojih događaja | Korisnik može pregledavati svoje nadolazeće i prošle događaje. Organizatori će moći vidjeti vlastite kreirane događaje kao i one na koje su se pretplatili, moći će vidjeti i prošle događaje koji su završili, ali ih neće moći uređivati ili postavljati objave na njih.| ???
F09 | Kreiranje objava na događaj | Organizator događaja ima mogućnost kreiranja objave u obliku komentara ispod događaja. Korisnici koji pregledavaju detalje događaja mogu vidjeti objavu organizatora. | ???
F10 | Pregledavanje objava i komentiranje | Korisnik će kod pregleda detalja odabranog događaja moći vidjeti objave od strane organizatora te komentare na te objave od drugih korisnika. | ???
F11 | Pregledavanje sudionika | Korisnik će moći kod pregleda detalja odabranog događaja vidjeti broj sudionika te klikom na broj sudionika moći će vidjeti listu sudionika koji su pretplaćeni na događaj. | ???
F12 | Upravljanje obavijestima | Obavijestima se može upravljati na način da ih se potpuno isključi u postavkama profila uključivanjem opcije "Isključi obavijesti aplikacije". Također korisnik može isključiti obavijesti pojedinog događaja tako da odabere događaj na koji se pretplatio i pritisne gumb "Isključi obavijesti" prilikom čega korisnik neće primati nikakve obavijesti koje imaju veze s tim događajem. | ???
F13 | Kreiranje objave | Organizator će imati opciju kreiranja objave na vlastiti kreirani događaj. | ???
F14 | Upravljanje sudionicima | Organizator će kod prikazivanja sudionika na vlastitom događaju imati opciju uklanjanja sudionika sa događaja ili stavljanja zabrane pristupa korisniku na taj događaj | ???
F15 | Slanje notifikacija | Aplikacija će na mobilni uređaj slati notifikacije o početku događaja, kreiranoj objavi na događaju od strane organizatora, poslati će biti obavijest organizatoru ukoliko netko odgovori na njegovu objavu te će upozoriti sve sudionike koje su pretplaćene na događaj o početku događaja. Korisnici kojima je odobren zahtjev za organizatora također će dobiti obavijest o tome. | ???

## Tehnologije i oprema
Projekt se fokusira na razvoj mobilne aplikacije za informiranje o budućim događajima, koja će omogućiti korisnicima pravovremene informacije o nadolazećim događajima. Aplikacija će biti razvijena koristeći najnovije tehnologije i alate kako bi se osigurala izvrsna korisnička iskustva.

Programski jezik Kotlin: Kotlin će biti glavni programski jezik korišten za razvoj aplikacije. Kotlin je moderni programski jezik koji je specifično dizajniran za Android platformu, pružajući visoku produktivnost i performanse.

Android Studio: Android Studio će biti glavno razvojno okruženje koje će se koristiti za izradu aplikacije. Android Studio pruža bogat skup alata i resursa za razvoj Android aplikacija, uključujući emulator za testiranje i optimizaciju performansi aplikacije.

Baza podataka: Aplikacija će koristiti Firebase za modeliranje baze podataka i pohranu korisničkih podataka. Firebase je platforma za razvoj mobilnih i web aplikacija koja je razvijena od strane Goodle-a. Nudi širok spektar alata i usluga koji olakšavaju razvoj, testiranje i optimizaciju aplikacije. Pruža real-time bazu podataka koja omogućuje trenutno sinkroniziranje podataka između korisnika aplikacije.
 
Git i GitHub: Za verzioniranje programskog koda koristit ćemo Git kao sustav za kontrolu verzija, a GitHub će nam biti platforma za rad na programskom rješenju i projektu u cjelini. Ovo će omogućiti timu da učinkovito surađuje na razvoju aplikacije, prati promjene i održava povijest razvoja.

## .gitignore
Uzmite u obzir da je u mapi Software .gitignore konfiguriran za nekoliko tehnologija, ali samo ako će projekti biti smješteni direktno u mapu Software ali ne i u neku pod mapu. Nakon odabira konačne tehnologije i projekta obavezno dopunite/premjestite gitignore kako bi vaš projekt zadovoljavao kriterije koji su opisani u ReadMe.md dokumentu dostupnom u mapi Software.
