// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.owners

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OwnerListParamsTest {

    @Test
    fun create() {
        OwnerListParams.builder().after("after").archived(true).email("email").limit(0).build()
    }

    @Test
    fun queryParams() {
        val params =
            OwnerListParams.builder().after("after").archived(true).email("email").limit(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("archived", "true")
                    .put("email", "email")
                    .put("limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OwnerListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
