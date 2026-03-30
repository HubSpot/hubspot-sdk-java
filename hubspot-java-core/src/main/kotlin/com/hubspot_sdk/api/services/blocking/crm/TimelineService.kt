// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.timeline.AppEventOccurrence
import com.hubspot_sdk.api.models.crm.timeline.AppEventResolutionResponse
import com.hubspot_sdk.api.models.crm.timeline.ExternalAppEventResolutionRequest
import com.hubspot_sdk.api.models.crm.timeline.TimelineCreateEventParams
import com.hubspot_sdk.api.models.crm.timeline.TimelineCreateProjectTypeParams
import com.hubspot_sdk.api.services.blocking.crm.timeline.BatchService
import java.util.function.Consumer

interface TimelineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TimelineService

    fun batch(): BatchService

    /** Send a single instance of event data to a specified event type. */
    fun createEvent(params: TimelineCreateEventParams) = createEvent(params, RequestOptions.none())

    /** @see createEvent */
    fun createEvent(
        params: TimelineCreateEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see createEvent */
    fun createEvent(
        appEventOccurrence: AppEventOccurrence,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        createEvent(
            TimelineCreateEventParams.builder().appEventOccurrence(appEventOccurrence).build(),
            requestOptions,
        )

    /** @see createEvent */
    fun createEvent(appEventOccurrence: AppEventOccurrence) =
        createEvent(appEventOccurrence, RequestOptions.none())

    fun createProjectType(params: TimelineCreateProjectTypeParams): AppEventResolutionResponse =
        createProjectType(params, RequestOptions.none())

    /** @see createProjectType */
    fun createProjectType(
        params: TimelineCreateProjectTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppEventResolutionResponse

    /** @see createProjectType */
    fun createProjectType(
        externalAppEventResolutionRequest: ExternalAppEventResolutionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppEventResolutionResponse =
        createProjectType(
            TimelineCreateProjectTypeParams.builder()
                .externalAppEventResolutionRequest(externalAppEventResolutionRequest)
                .build(),
            requestOptions,
        )

    /** @see createProjectType */
    fun createProjectType(
        externalAppEventResolutionRequest: ExternalAppEventResolutionRequest
    ): AppEventResolutionResponse =
        createProjectType(externalAppEventResolutionRequest, RequestOptions.none())

    /** A view of [TimelineService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TimelineService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /integrators/timeline/2026-03/events`, but is
         * otherwise the same as [TimelineService.createEvent].
         */
        @MustBeClosed
        fun createEvent(params: TimelineCreateEventParams): HttpResponse =
            createEvent(params, RequestOptions.none())

        /** @see createEvent */
        @MustBeClosed
        fun createEvent(
            params: TimelineCreateEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createEvent */
        @MustBeClosed
        fun createEvent(
            appEventOccurrence: AppEventOccurrence,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createEvent(
                TimelineCreateEventParams.builder().appEventOccurrence(appEventOccurrence).build(),
                requestOptions,
            )

        /** @see createEvent */
        @MustBeClosed
        fun createEvent(appEventOccurrence: AppEventOccurrence): HttpResponse =
            createEvent(appEventOccurrence, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /integrators/timeline/2026-03/types/projects`, but
         * is otherwise the same as [TimelineService.createProjectType].
         */
        @MustBeClosed
        fun createProjectType(
            params: TimelineCreateProjectTypeParams
        ): HttpResponseFor<AppEventResolutionResponse> =
            createProjectType(params, RequestOptions.none())

        /** @see createProjectType */
        @MustBeClosed
        fun createProjectType(
            params: TimelineCreateProjectTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppEventResolutionResponse>

        /** @see createProjectType */
        @MustBeClosed
        fun createProjectType(
            externalAppEventResolutionRequest: ExternalAppEventResolutionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppEventResolutionResponse> =
            createProjectType(
                TimelineCreateProjectTypeParams.builder()
                    .externalAppEventResolutionRequest(externalAppEventResolutionRequest)
                    .build(),
                requestOptions,
            )

        /** @see createProjectType */
        @MustBeClosed
        fun createProjectType(
            externalAppEventResolutionRequest: ExternalAppEventResolutionRequest
        ): HttpResponseFor<AppEventResolutionResponse> =
            createProjectType(externalAppEventResolutionRequest, RequestOptions.none())
    }
}
