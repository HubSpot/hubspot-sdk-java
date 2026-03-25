// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.batch

import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.associations.BatchInputPublicAssociationMultiPost
import com.hubspot_sdk.api.models.crm.associations.PublicAssociationMultiPost
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchDeleteLabelsParamsTest {

    @Test
    fun create() {
        BatchDeleteLabelsParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .batchInputPublicAssociationMultiPost(
                BatchInputPublicAssociationMultiPost.builder()
                    .addInput(
                        PublicAssociationMultiPost.builder()
                            .from(PublicObjectId.builder().id("id").build())
                            .to(PublicObjectId.builder().id("id").build())
                            .addType(
                                AssociationSpec.builder()
                                    .associationCategory(
                                        AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                    )
                                    .associationTypeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchDeleteLabelsParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationMultiPost(
                    BatchInputPublicAssociationMultiPost.builder()
                        .addInput(
                            PublicAssociationMultiPost.builder()
                                .from(PublicObjectId.builder().id("id").build())
                                .to(PublicObjectId.builder().id("id").build())
                                .addType(
                                    AssociationSpec.builder()
                                        .associationCategory(
                                            AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                        )
                                        .associationTypeId(0)
                                        .build()
                                )
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
            BatchDeleteLabelsParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationMultiPost(
                    BatchInputPublicAssociationMultiPost.builder()
                        .addInput(
                            PublicAssociationMultiPost.builder()
                                .from(PublicObjectId.builder().id("id").build())
                                .to(PublicObjectId.builder().id("id").build())
                                .addType(
                                    AssociationSpec.builder()
                                        .associationCategory(
                                            AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                        )
                                        .associationTypeId(0)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicAssociationMultiPost.builder()
                    .addInput(
                        PublicAssociationMultiPost.builder()
                            .from(PublicObjectId.builder().id("id").build())
                            .to(PublicObjectId.builder().id("id").build())
                            .addType(
                                AssociationSpec.builder()
                                    .associationCategory(
                                        AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                    )
                                    .associationTypeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
