package com.geeks.hw_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.hw_1.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: FilmAdapter
    private var list = listOf<FilmModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter = FilmAdapter(list)
        binding.rvFilms.adapter = adapter
    }

    private fun loadData() {
        list = listOf(
            FilmModel(
                name = "Человек-паук",
                rate = "4.8 (749)",
                img = "https://citaty.info/files/portraits/piter-parker-chelovek-pauk.jpg"
            ),
            FilmModel(
                name = "Человек-паук 2",
                rate = "4.6 (690)",
                img = "https://kinogo.ec/uploads/mini/minifull/0f3/1585483633-1939163418.webp"
            ),
            FilmModel(
                name = "Человек-паук 3: Враг в отражении (2007)",
                rate = "4.7 (679)",
                img = "https://kinogo.ec/uploads/mini/minifull/606/1585699775-2091626533.webp"
            ),
            FilmModel(
                name = "Новый Человек-паук",
                rate = "4.4 (653)",
                img = "https://blog.okko.tv/thumb/520x0/filters:quality(75):no_upscale()/imgs/2023/06/21/02/5954153/31fd509133c41b832109deef2092d6aa755ea075.jpeg"
            ),
            FilmModel(
                name = "Новый Человек-паук: Высокое напряжение",
                rate = "3.9 (559)",
                img = "https://blog.okko.tv/thumb/520x0/filters:quality(75):no_upscale()/imgs/2023/06/21/02/5954151/7f22ffbacf186cbacb5fcaa5bd6d69f1675538fc.jpeg"
            ),
            FilmModel(
                name = "Человек-паук",
                rate = "4.8 (749)",
                img = "https://citaty.info/files/portraits/piter-parker-chelovek-pauk.jpg"
            ),
            FilmModel(
                name = "Человек-паук 2",
                rate = "4.6 (690)",
                img = "https://kinogo.ec/uploads/mini/minifull/0f3/1585483633-1939163418.webp"
            ),
            FilmModel(
                name = "Человек-паук 3: Враг в отражении (2007)",
                rate = "4.7 (679)",
                img = "https://kinogo.ec/uploads/mini/minifull/606/1585699775-2091626533.webp"
            ),
            FilmModel(
                name = "Новый Человек-паук",
                rate = "4.4 (653)",
                img = "https://blog.okko.tv/thumb/520x0/filters:quality(75):no_upscale()/imgs/2023/06/21/02/5954153/31fd509133c41b832109deef2092d6aa755ea075.jpeg"
            ),
            FilmModel(
                name = "Новый Человек-паук: Высокое напряжение",
                rate = "3.9 (559)",
                img = "https://blog.okko.tv/thumb/520x0/filters:quality(75):no_upscale()/imgs/2023/06/21/02/5954151/7f22ffbacf186cbacb5fcaa5bd6d69f1675538fc.jpeg"
            ),
            FilmModel(
                name = "Человек-паук",
                rate = "4.8 (749)",
                img = "https://citaty.info/files/portraits/piter-parker-chelovek-pauk.jpg"
            ),
            FilmModel(
                name = "Человек-паук 2",
                rate = "4.6 (690)",
                img = "https://kinogo.ec/uploads/mini/minifull/0f3/1585483633-1939163418.webp"
            ),
            FilmModel(
                name = "Человек-паук 3: Враг в отражении (2007)",
                rate = "4.7 (679)",
                img = "https://kinogo.ec/uploads/mini/minifull/606/1585699775-2091626533.webp"
            ),
            FilmModel(
                name = "Новый Человек-паук",
                rate = "4.4 (653)",
                img = "https://blog.okko.tv/thumb/520x0/filters:quality(75):no_upscale()/imgs/2023/06/21/02/5954153/31fd509133c41b832109deef2092d6aa755ea075.jpeg"
            ),
            FilmModel(
                name = "Новый Человек-паук: Высокое напряжение",
                rate = "3.9 (559)",
                img = "https://blog.okko.tv/thumb/520x0/filters:quality(75):no_upscale()/imgs/2023/06/21/02/5954151/7f22ffbacf186cbacb5fcaa5bd6d69f1675538fc.jpeg"
            )
        )
    }
}