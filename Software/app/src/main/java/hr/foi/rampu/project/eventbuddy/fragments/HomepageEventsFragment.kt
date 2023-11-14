package hr.foi.rampu.project.eventbuddy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hr.foi.rampu.project.eventbuddy.R
import hr.foi.rampu.project.eventbuddy.adapters.EventsAdapter
import hr.foi.rampu.project.eventbuddy.helpers.MockDataLoader

class HomepageEventsFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_homepage_events, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById(R.id.rv_homepage_events)
        recyclerView.adapter = EventsAdapter(MockDataLoader.getDemoData())
        recyclerView.layoutManager = LinearLayoutManager(view.context)
    }

    override fun onResume() {
        super.onResume()
        recyclerView = requireView().findViewById(R.id.rv_homepage_events)
        recyclerView.adapter = EventsAdapter(MockDataLoader.getDemoData())
        recyclerView.layoutManager = LinearLayoutManager(requireView().context)
    }
}
