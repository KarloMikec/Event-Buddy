package hr.foi.rampu.project.eventbuddy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import hr.foi.rampu.project.eventbuddy.R
import hr.foi.rampu.project.eventbuddy.entities.User
import hr.foi.rampu.project.eventbuddy.helpers.MockDataLoader

class EditFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        popuniInputeSaStarimPodacima()

        val btnOdustani = view.findViewById<MaterialButton>(R.id.btn_edit_odustani)
        btnOdustani.setOnClickListener {
            popuniInputeSaStarimPodacima()
        }

        val btnSpremi = view.findViewById<MaterialButton>(R.id.btn_edit_spremi)
        btnSpremi.setOnClickListener {
            val ime = view.findViewById<TextInputEditText>(R.id.ime_uredi_profil).text.toString()
            val prezime = view.findViewById<TextInputEditText>(R.id.prezime_uredi_profil).text.toString()
            val korisnickoIme = view.findViewById<TextInputEditText>(R.id.korime_uredi_profil).text.toString()
            val staraLozinka = view.findViewById<TextInputEditText>(R.id.user_lozinka_uredi_profil).text.toString()
            val novaLozinka = view.findViewById<TextInputEditText>(R.id.user_lozinka_potvrdi_uredi_profil).text.toString()
            val postojeciUser = MockDataLoader.getDemoUsers().find { x -> x.korime == korisnickoIme }
            if(postojeciUser!!.lozinka == staraLozinka){
                if(novaLozinka == ""){
                    MockDataLoader.spremiNovePodatke(User(ime, prezime, korisnickoIme, staraLozinka, postojeciUser!!.pravo))
                    Toast.makeText(context, "Uspješno spremljeni podaci!", Toast.LENGTH_SHORT).show()
                    popuniInputeSaStarimPodacima()
                }else {
                    if(novaLozinka.length >= 8){
                        MockDataLoader.spremiNovePodatke(User(ime, prezime, korisnickoIme, novaLozinka, postojeciUser!!.pravo))
                        Toast.makeText(context, "Uspješno spremljeni podaci!", Toast.LENGTH_SHORT).show()
                        Toast.makeText(context, "Spremljena nova lozinka!", Toast.LENGTH_SHORT).show()
                        popuniInputeSaStarimPodacima()
                    }else{
                        Toast.makeText(context, "Nova lozinka ima manje od 8 znakova!", Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(context, "Unesite točnu staru lozinku!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun popuniInputeSaStarimPodacima(){
        val prijavljenUser = MockDataLoader.logedInUser
        view?.findViewById<TextInputEditText>(R.id.ime_uredi_profil)?.setText(prijavljenUser?.ime)
        view?.findViewById<TextInputEditText>(R.id.prezime_uredi_profil)?.setText(prijavljenUser?.prezime)
        view?.findViewById<TextInputEditText>(R.id.korime_uredi_profil)?.setText(prijavljenUser?.korime)
        view?.findViewById<TextInputEditText>(R.id.user_lozinka_uredi_profil)?.setText("")
        view?.findViewById<TextInputEditText>(R.id.user_lozinka_potvrdi_uredi_profil)?.setText("")
    }
}