package com.startup.homians.ui.home

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.startup.homians.*
import com.startup.homians.Adapter.CategoryGridAdapter
import com.startup.homians.Adapter.CategoryRAdapter
import com.startup.homians.Adapter.KitchenRAdapter
import com.startup.homians.comon.Cart
import com.startup.homians.comon.Location
import com.startup.homians.comon.Notification
import com.startup.homians.comon.Search
import com.startup.homians.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

private var _binding: FragmentHomeBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!
    lateinit var kitList: List<KitchenViewModal>
  lateinit var catList: List<CategoryViewModal>
    private lateinit var KRAdapter: KitchenRAdapter
  private lateinit var CRAdapter: CategoryRAdapter
  @SuppressLint("NotifyDataSetChanged")
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {

    _binding = FragmentHomeBinding.inflate(inflater, container, false)
    val root: View = binding.root

      kitList = ArrayList<KitchenViewModal>()
    catList = ArrayList<CategoryViewModal>()

      kitList = kitList + KitchenViewModal("C++", R.drawable.kit)
      kitList = kitList + KitchenViewModal("Java", R.drawable.kit)
      kitList = kitList + KitchenViewModal("Android", R.drawable.kit)
      kitList = kitList + KitchenViewModal("Python", R.drawable.kit)
      kitList = kitList + KitchenViewModal("Javascript", R.drawable.kit)


    catList = catList + CategoryViewModal("C++", R.drawable.kit)
    catList = catList + CategoryViewModal("Java", R.drawable.kit)
    catList = catList + CategoryViewModal("Android", R.drawable.kit)
    catList = catList + CategoryViewModal("Python", R.drawable.kit)
    catList = catList + CategoryViewModal("Javascript", R.drawable.kit)

      val all_kichen:TextView=binding.allKitchen
      val all_category:TextView=binding.allCategory
      val krecyclerView :RecyclerView=binding.krecyclerView
    val crecyclerView :RecyclerView=binding.crecyclerView
    val loaction_btn:TextView=binding.locationBtn
    val search_btn:ImageView=binding.searchBtn
    val cart_btn:ImageView=binding.cartBtn
    val noti_btn:ImageView=binding.notificationBtn


      KRAdapter = KitchenRAdapter(kitList)
    CRAdapter = CategoryRAdapter(catList)


      val klayoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
      krecyclerView.layoutManager = klayoutManager
      krecyclerView.adapter = KRAdapter
      KRAdapter.notifyDataSetChanged()

    val clayoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
    crecyclerView.layoutManager = clayoutManager
    crecyclerView.adapter = CRAdapter
    CRAdapter.notifyDataSetChanged()



      all_kichen.setOnClickListener(View.OnClickListener {
          var intent= Intent(activity, All_Kitchen::class.java)
          startActivity(intent)
      })

      all_category.setOnClickListener(View.OnClickListener {
          var intent= Intent(activity, All_Category::class.java)
          startActivity(intent)
      })

    loaction_btn.setOnClickListener(View.OnClickListener {
      var intent= Intent(activity, Location::class.java)
      startActivity(intent)
    })

    search_btn.setOnClickListener(View.OnClickListener {
      var intent= Intent(activity, Search::class.java)
      startActivity(intent)
    })

    cart_btn.setOnClickListener(View.OnClickListener {
      var intent= Intent(activity, Cart::class.java)
      startActivity(intent)
    })

    noti_btn.setOnClickListener(View.OnClickListener {
      var intent= Intent(activity, Notification::class.java)
      startActivity(intent)
    })


    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
