// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.partnerclients

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerClientListAssociationsParamsTest {

    @Test
    fun create() {
        PartnerClientListAssociationsParams.builder()
            .partnerClientId("partnerClientId")
            .toObjectType("toObjectType")
            .after("after")
            .limit(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PartnerClientListAssociationsParams.builder()
                .partnerClientId("partnerClientId")
                .toObjectType("toObjectType")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("partnerClientId")
        assertThat(params._pathParam(1)).isEqualTo("toObjectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PartnerClientListAssociationsParams.builder()
                .partnerClientId("partnerClientId")
                .toObjectType("toObjectType")
                .after("after")
                .limit(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("after", "after").put("limit", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PartnerClientListAssociationsParams.builder()
                .partnerClientId("partnerClientId")
                .toObjectType("toObjectType")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
