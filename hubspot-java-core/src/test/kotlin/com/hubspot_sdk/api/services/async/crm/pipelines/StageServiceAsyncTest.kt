// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.pipelines

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStageInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStagePatchInput
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageGetAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageGetParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageListParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageReplaceParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageServiceAsync = client.crm().pipelines().stages()

        val pipelineStageFuture =
            stageServiceAsync.create(
                StageCreateParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .pipelineStageInput(
                        PipelineStageInput.builder()
                            .displayOrder(1)
                            .label("Done")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageServiceAsync = client.crm().pipelines().stages()

        val pipelineStageFuture =
            stageServiceAsync.update(
                StageUpdateParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .pipelineStagePatchInput(
                        PipelineStagePatchInput.builder()
                            .metadata(
                                PipelineStagePatchInput.Metadata.builder()
                                    .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                    .build()
                            )
                            .archived(true)
                            .displayOrder(1)
                            .label("Done")
                            .build()
                    )
                    .build()
            )

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageServiceAsync = client.crm().pipelines().stages()

        val collectionResponsePipelineStageNoPagingFuture =
            stageServiceAsync.list(
                StageListParams.builder().objectType("objectType").pipelineId("pipelineId").build()
            )

        val collectionResponsePipelineStageNoPaging =
            collectionResponsePipelineStageNoPagingFuture.get()
        collectionResponsePipelineStageNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageServiceAsync = client.crm().pipelines().stages()

        val future =
            stageServiceAsync.delete(
                StageDeleteParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageServiceAsync = client.crm().pipelines().stages()

        val pipelineStageFuture =
            stageServiceAsync.get(
                StageGetParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAudit() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageServiceAsync = client.crm().pipelines().stages()

        val collectionResponsePublicAuditInfoNoPagingFuture =
            stageServiceAsync.getAudit(
                StageGetAuditParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        val collectionResponsePublicAuditInfoNoPaging =
            collectionResponsePublicAuditInfoNoPagingFuture.get()
        collectionResponsePublicAuditInfoNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun replace() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageServiceAsync = client.crm().pipelines().stages()

        val pipelineStageFuture =
            stageServiceAsync.replace(
                StageReplaceParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .pipelineStageInput(
                        PipelineStageInput.builder()
                            .displayOrder(1)
                            .label("Done")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val pipelineStage = pipelineStageFuture.get()
        pipelineStage.validate()
    }
}
