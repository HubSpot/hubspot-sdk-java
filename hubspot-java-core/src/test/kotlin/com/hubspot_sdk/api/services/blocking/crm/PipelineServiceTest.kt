// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.pipelines.PipelineCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineListParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineReplaceParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStageInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStagePatchInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStageReplaceInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PipelineServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pipelineService = client.crm().pipelines()

        val pipelineStage =
            pipelineService.create(
                PipelineCreateParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .pipelineStageInput(
                        PipelineStageInput.builder()
                            .displayOrder(0)
                            .label("label")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .stageId("stageId")
                            .build()
                    )
                    .build()
            )

        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pipelineService = client.crm().pipelines()

        val pipelineStage =
            pipelineService.update(
                PipelineUpdateParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .pipelineStagePatchInput(
                        PipelineStagePatchInput.builder()
                            .metadata(
                                PipelineStagePatchInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .archived(true)
                            .displayOrder(0)
                            .label("label")
                            .build()
                    )
                    .build()
            )

        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pipelineService = client.crm().pipelines()

        val collectionResponsePipelineStageNoPaging =
            pipelineService.list(
                PipelineListParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .build()
            )

        collectionResponsePipelineStageNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pipelineService = client.crm().pipelines()

        pipelineService.delete(
            PipelineDeleteParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pipelineService = client.crm().pipelines()

        val pipelineStage =
            pipelineService.get(
                PipelineGetParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        pipelineStage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAudit() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pipelineService = client.crm().pipelines()

        val collectionResponsePublicAuditInfoNoPaging =
            pipelineService.getAudit(
                PipelineGetAuditParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        collectionResponsePublicAuditInfoNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pipelineService = client.crm().pipelines()

        val pipelineStage =
            pipelineService.replace(
                PipelineReplaceParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .pipelineStageReplaceInput(
                        PipelineStageReplaceInput.builder()
                            .displayOrder(0)
                            .label("label")
                            .metadata(
                                PipelineStageReplaceInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        pipelineStage.validate()
    }
}
