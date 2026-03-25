// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.listings

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.crm.objects.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListingGetParamsTest {

    @Test
    fun create() {
        ListingGetParams.builder()
            .archived(true)
            .batchReadInputSimplePublicObjectId(
                BatchReadInputSimplePublicObjectId.builder()
                    .addInput(SimplePublicObjectId.builder().id("430001").build())
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .idProperty("idProperty")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ListingGetParams.builder()
                .archived(true)
                .batchReadInputSimplePublicObjectId(
                    BatchReadInputSimplePublicObjectId.builder()
                        .addInput(SimplePublicObjectId.builder().id("430001").build())
                        .addProperty("string")
                        .addPropertiesWithHistory("string")
                        .idProperty("idProperty")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ListingGetParams.builder()
                .batchReadInputSimplePublicObjectId(
                    BatchReadInputSimplePublicObjectId.builder()
                        .addInput(SimplePublicObjectId.builder().id("430001").build())
                        .addProperty("string")
                        .addPropertiesWithHistory("string")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ListingGetParams.builder()
                .archived(true)
                .batchReadInputSimplePublicObjectId(
                    BatchReadInputSimplePublicObjectId.builder()
                        .addInput(SimplePublicObjectId.builder().id("430001").build())
                        .addProperty("string")
                        .addPropertiesWithHistory("string")
                        .idProperty("idProperty")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchReadInputSimplePublicObjectId.builder()
                    .addInput(SimplePublicObjectId.builder().id("430001").build())
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .idProperty("idProperty")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ListingGetParams.builder()
                .batchReadInputSimplePublicObjectId(
                    BatchReadInputSimplePublicObjectId.builder()
                        .addInput(SimplePublicObjectId.builder().id("430001").build())
                        .addProperty("string")
                        .addPropertiesWithHistory("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchReadInputSimplePublicObjectId.builder()
                    .addInput(SimplePublicObjectId.builder().id("430001").build())
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .build()
            )
    }
}
