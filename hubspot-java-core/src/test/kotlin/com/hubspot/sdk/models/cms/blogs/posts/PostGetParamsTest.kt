// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.posts

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostGetParamsTest {

    @Test
    fun create() {
        PostGetParams.builder().objectId("objectId").archived(true).property("property").build()
    }

    @Test
    fun pathParams() {
        val params = PostGetParams.builder().objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PostGetParams.builder().objectId("objectId").archived(true).property("property").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("archived", "true").put("property", "property").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PostGetParams.builder().objectId("objectId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
