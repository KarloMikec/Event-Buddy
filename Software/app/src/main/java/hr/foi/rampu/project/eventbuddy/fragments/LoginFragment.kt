package hr.foi.rampu.project.eventbuddy.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import hr.foi.rampu.project.eventbuddy.R


class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        view.findViewById<Button>(R.id.btn_fragment_login_register).setOnClickListener {
            val navRegister = activity as FragmentNavigation
            navRegister.navigateFragment(RegistrationFragment(), false)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val buttonClick = view.findViewById<Button>(R.id.btn_fragment_login_register)
        buttonClick.setOnClickListener {
            val registrationFragment = RegistrationFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.container, registrationFragment)
                ?.commit()
        }
    }
}