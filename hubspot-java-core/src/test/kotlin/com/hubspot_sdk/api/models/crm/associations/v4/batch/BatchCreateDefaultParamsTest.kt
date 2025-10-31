// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4.batch

import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.associations.BatchInputPublicDefaultAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.PublicDefaultAssociationMultiPost
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateDefaultParamsTest {

    @Test
    fun create() {
        BatchCreateDefaultParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .batchInputPublicDefaultAssociationMultiPost(
                BatchInputPublicDefaultAssociationMultiPost.builder()
                    .addInput(
                        PublicDefaultAssociationMultiPost.builder()
                            .from(PublicObjectId.builder().id("id").build())
                            .to(PublicObjectId.builder().id("id").build())
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchCreateDefaultParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicDefaultAssociationMultiPost(
                    BatchInputPublicDefaultAssociationMultiPost.builder()
                        .addInput(
                            PublicDefaultAssociationMultiPost.builder()
                                .from(PublicObjectId.builder().id("id").build())
                                .to(PublicObjectId.builder().id("id").build())
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
            BatchCreateDefaultParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicDefaultAssociationMultiPost(
                    BatchInputPublicDefaultAssociationMultiPost.builder()
                        .addInput(
                            PublicDefaultAssociationMultiPost.builder()
                                .from(PublicObjectId.builder().id("id").build())
                                .to(PublicObjectId.builder().id("id").build())
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicDefaultAssociationMultiPost.builder()
                    .addInput(
                        PublicDefaultAssociationMultiPost.builder()
                            .from(PublicObjectId.builder().id("id").build())
                            .to(PublicObjectId.builder().id("id").build())
                            .build()
                    )
                    .build()
            )
    }
}
