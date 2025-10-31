// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.owners

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OwnerGetParamsTest {

    @Test
    fun create() {
        OwnerGetParams.builder()
            .ownerId(0)
            .archived(true)
            .idProperty(OwnerGetParams.IdProperty.ID)
            .build()
    }

    @Test
    fun pathParams() {
        val params = OwnerGetParams.builder().ownerId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            OwnerGetParams.builder()
                .ownerId(0)
                .archived(true)
                .idProperty(OwnerGetParams.IdProperty.ID)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("archived", "true").put("idProperty", "id").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OwnerGetParams.builder().ownerId(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
