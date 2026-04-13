// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.actions.definitions

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionListParamsTest {

    @Test
    fun create() {
        DefinitionListParams.builder().appId(0).after("after").archived(true).limit(0).build()
    }

    @Test
    fun pathParams() {
        val params = DefinitionListParams.builder().appId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DefinitionListParams.builder().appId(0).after("after").archived(true).limit(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("archived", "true")
                    .put("limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DefinitionListParams.builder().appId(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
