// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4.batch

import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.associations.v4.BatchInputPublicAssociationMultiArchive
import com.hubspot_sdk.api.models.crm.associations.v4.PublicAssociationMultiArchive
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchDeleteParamsTest {

    @Test
    fun create() {
        BatchDeleteParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .batchInputPublicAssociationMultiArchive(
                BatchInputPublicAssociationMultiArchive.builder()
                    .addInput(
                        PublicAssociationMultiArchive.builder()
                            .from(PublicObjectId.builder().id("37295").build())
                            .addTo(PublicObjectId.builder().id("37295").build())
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchDeleteParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationMultiArchive(
                    BatchInputPublicAssociationMultiArchive.builder()
                        .addInput(
                            PublicAssociationMultiArchive.builder()
                                .from(PublicObjectId.builder().id("37295").build())
                                .addTo(PublicObjectId.builder().id("37295").build())
                                .build()
                        )
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
            BatchDeleteParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationMultiArchive(
                    BatchInputPublicAssociationMultiArchive.builder()
                        .addInput(
                            PublicAssociationMultiArchive.builder()
                                .from(PublicObjectId.builder().id("37295").build())
                                .addTo(PublicObjectId.builder().id("37295").build())
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicAssociationMultiArchive.builder()
                    .addInput(
                        PublicAssociationMultiArchive.builder()
                            .from(PublicObjectId.builder().id("37295").build())
                            .addTo(PublicObjectId.builder().id("37295").build())
                            .build()
                    )
                    .build()
            )
    }
}
