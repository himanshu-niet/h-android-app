package com.startup.homians

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.startup.homians.Adapter.NotificationRAdapter
import com.startup.homians.databinding.FragmentFAQs2Binding
import com.startup.homians.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER



class FAQs : Fragment() {
    private var _binding:FragmentFAQs2Binding? = null
    private val binding get() = _binding!!

    lateinit var faqsList: List<NotificationViewModal>
    lateinit var faqsRecyclerView: RecyclerView
    lateinit var faqsRAdapter: NotificationRAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View{
        _binding = FragmentFAQs2Binding.inflate(inflater, container, false)
        val root: View = binding.root
        faqsRecyclerView=binding.faqsRecyclerView

        faqsList = ArrayList<NotificationViewModal>()
        val desc="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        faqsList = faqsList + NotificationViewModal("C++","18/08/2022",desc)
        faqsList = faqsList + NotificationViewModal("Java", "18/08/2022",desc)
        faqsList = faqsList + NotificationViewModal("Android", "18/08/2022",desc)
        faqsList = faqsList + NotificationViewModal("Python", "18/08/2022",desc)
        faqsList = faqsList + NotificationViewModal("Javascript", "18/08/2022",desc)

        faqsRAdapter = NotificationRAdapter(faqsList)
        val klayoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)
        faqsRecyclerView.layoutManager = klayoutManager
        faqsRecyclerView.adapter = faqsRAdapter
        faqsRAdapter.notifyDataSetChanged()
        
        return root
    }
    


}