// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.definitions

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionListParamsTest {

    @Test
    fun create() {
        DefinitionListParams.builder()
            .after("after")
            .includeProperties(true)
            .limit(0)
            .searchString("searchString")
            .sortOrder("sortOrder")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DefinitionListParams.builder()
                .after("after")
                .includeProperties(true)
                .limit(0)
                .searchString("searchString")
                .sortOrder("sortOrder")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("includeProperties", "true")
                    .put("limit", "0")
                    .put("searchString", "searchString")
                    .put("sortOrder", "sortOrder")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DefinitionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
