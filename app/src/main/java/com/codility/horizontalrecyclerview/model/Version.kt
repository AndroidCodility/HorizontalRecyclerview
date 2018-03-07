package com.codility.horizontalrecyclerview.model

/**
 * Created by Govind on 3/7/2018.
 */
class Version(val url: String, val name: String) {

    companion object {

        fun getList(): List<Version> {
            val versionList = ArrayList<Version>()
            versionList.clear()
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/one.jpg", "Greenary"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/two.jpg", "Ocean"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/three.jpg", "Fruit"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/four.jpg", "Shop"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/five.jpg", "Mountain"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/six.jpg", "Coins"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/seven.jpg", "Slimmer"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/eight.jpg", "Clouds"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/nine.jpg", "Sky High"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/ten.jpg", "Sun in oView"))
            return versionList
        }
    }
}