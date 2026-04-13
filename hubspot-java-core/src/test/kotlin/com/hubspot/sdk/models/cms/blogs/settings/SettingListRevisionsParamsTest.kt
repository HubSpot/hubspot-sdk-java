// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.settings

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingListRevisionsParamsTest {

    @Test
    fun create() {
        SettingListRevisionsParams.builder()
            .blogId("blogId")
            .after("after")
            .before("before")
            .limit(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params = SettingListRevisionsParams.builder().blogId("blogId").build()

        assertThat(params._pathParam(0)).isEqualTo("blogId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SettingListRevisionsParams.builder()
                .blogId("blogId")
                .after("after")
                .before("before")
                .limit(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("before", "before")
                    .put("limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SettingListRevisionsParams.builder().blogId("blogId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
