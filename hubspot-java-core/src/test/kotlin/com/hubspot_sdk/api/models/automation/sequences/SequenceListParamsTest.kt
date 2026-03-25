// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SequenceListParamsTest {

    @Test
    fun create() {
        SequenceListParams.builder().userId("userId").after("after").limit(0).name("name").build()
    }

    @Test
    fun queryParams() {
        val params =
            SequenceListParams.builder()
                .userId("userId")
                .after("after")
                .limit(0)
                .name("name")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("userId", "userId")
                    .put("after", "after")
                    .put("limit", "0")
                    .put("name", "name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SequenceListParams.builder().userId("userId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("userId", "userId").build())
    }
}
