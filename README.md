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
Umjesto ovih uputa opišite zahtjeve za funkcionalnošću mobilne aplikacije ili aplikacije za pametne uređaje. Pobrojite osnovne funkcionalnosti i za svaku naznačite ime odgovornog člana tima. Opišite osnovnu buduću arhitekturu programskog proizvoda. Obratite pozornost da mobilne aplikacije često zahtijevaju pozadinske servise. Također uzmite u obzir da bi svaki član tima trebao biti odgovoran za otprilike 3 funkcionalnosti, te da bi opterećenje članova tima trebalo biti ujednačeno. Priložite odgovarajuće dijagrame i skice gdje je to prikladno. Funkcionalnosti sustava bobrojite u tablici ispod koristeći predložak koji slijedi:

Oznaka | Naziv | Kratki opis | Odgovorni član tima
------ | ----- | ----------- | -------------------
F01 | Upravljanje korisničkim računom |  prijava, registracija, promjena lozinke, brisanje | Zlatko Stapić
F02 | Upravljanje obavijestima |  ... | Zlatko Stapić
F03 | Pregledavanje događaja |  ... | Zlatko Stapić
F04 | Pretplata na događaj |  ... | Zlatko Stapić
F05 | Upravljanje događajem |  ... | Zlatko Stapić
F06 | Nadziranje zajednice |  ... | Zlatko Stapić
F07 | Pregledavanje svojih događaja |  ... | Zlatko Stapić
F08 | Upravljanje korisničkim računima i ulogama |  ... | Zlatko Stapić
F09 | Slanje notifikacija | .... | ...
F10 | Upravljanje zahtjevima za organizatora | .... | ...
F11 | Izmjenjivanje uloga u aplikaciji | .... | ...

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
