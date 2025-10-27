// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V4ListAssociationsByTypeParamsTest {

    @Test
    fun create() {
        V4ListAssociationsByTypeParams.builder()
            .objectType("objectType")
            .objectId("objectId")
            .toObjectType("toObjectType")
            .after("after")
            .limit(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            V4ListAssociationsByTypeParams.builder()
                .objectType("objectType")
                .objectId("objectId")
                .toObjectType("toObjectType")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        assertThat(params._pathParam(2)).isEqualTo("toObjectType")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            V4ListAssociationsByTypeParams.builder()
                .objectType("objectType")
                .objectId("objectId")
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
            V4ListAssociationsByTypeParams.builder()
                .objectType("objectType")
                .objectId("objectId")
                .toObjectType("toObjectType")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
