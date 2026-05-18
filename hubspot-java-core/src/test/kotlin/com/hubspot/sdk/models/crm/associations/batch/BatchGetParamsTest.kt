// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.associations.batch

import com.hubspot.sdk.models.crm.BatchInputPublicFetchAssociationsBatchRequest
import com.hubspot.sdk.models.crm.PublicFetchAssociationsBatchRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchGetParamsTest {

    @Test
    fun create() {
        BatchGetParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .batchInputPublicFetchAssociationsBatchRequest(
                BatchInputPublicFetchAssociationsBatchRequest.builder()
                    .addInput(
                        PublicFetchAssociationsBatchRequest.builder()
                            .id("id")
                            .after("after")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchGetParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicFetchAssociationsBatchRequest(
                    BatchInputPublicFetchAssociationsBatchRequest.builder()
                        .addInput(PublicFetchAssociationsBatchRequest.builder().id("id").build())
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fromObjectType")
        assertThat(params._pathParam(1)).isEqualTo("toObjectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BatchGetParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicFetchAssociationsBatchRequest(
                    BatchInputPublicFetchAssociationsBatchRequest.builder()
                        .addInput(
                            PublicFetchAssociationsBatchRequest.builder()
                                .id("id")
                                .after("after")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicFetchAssociationsBatchRequest.builder()
                    .addInput(
                        PublicFetchAssociationsBatchRequest.builder()
                            .id("id")
                            .after("after")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchGetParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicFetchAssociationsBatchRequest(
                    BatchInputPublicFetchAssociationsBatchRequest.builder()
                        .addInput(PublicFetchAssociationsBatchRequest.builder().id("id").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicFetchAssociationsBatchRequest.builder()
                    .addInput(PublicFetchAssociationsBatchRequest.builder().id("id").build())
                    .build()
            )
    }
}
