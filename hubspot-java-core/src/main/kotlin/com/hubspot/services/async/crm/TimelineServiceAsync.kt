// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.timeline.AppEventOccurrence
import com.hubspot.models.crm.timeline.AppEventResolutionResponse
import com.hubspot.models.crm.timeline.ExternalAppEventResolutionRequest
import com.hubspot.models.crm.timeline.TimelineCreateEventParams
import com.hubspot.models.crm.timeline.TimelineCreateProjectTypeParams
import com.hubspot.services.async.crm.timeline.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TimelineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TimelineServiceAsync

    fun batch(): BatchServiceAsync

    /** Send a single instance of event data to a specified event type. */
    fun createEvent(params: TimelineCreateEventParams): CompletableFuture<Void?> =
        createEvent(params, RequestOptions.none())

    /** @see createEvent */
    fun createEvent(
        params: TimelineCreateEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see createEvent */
    fun createEvent(
        appEventOccurrence: AppEventOccurrence,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        createEvent(
            TimelineCreateEventParams.builder().appEventOccurrence(appEventOccurrence).build(),
            requestOptions,
        )

    /** @see createEvent */
    fun createEvent(appEventOccurrence: AppEventOccurrence): CompletableFuture<Void?> =
        createEvent(appEventOccurrence, RequestOptions.none())

    fun createProjectType(
        params: TimelineCreateProjectTypeParams
    ): CompletableFuture<AppEventResolutionResponse> =
        createProjectType(params, RequestOptions.none())

    /** @see createProjectType */
    fun createProjectType(
        params: TimelineCreateProjectTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppEventResolutionResponse>

    /** @see createProjectType */
    fun createProjectType(
        externalAppEventResolutionRequest: ExternalAppEventResolutionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppEventResolutionResponse> =
        createProjectType(
            TimelineCreateProjectTypeParams.builder()
                .externalAppEventResolutionRequest(externalAppEventResolutionRequest)
                .build(),
            requestOptions,
        )

    /** @see createProjectType */
    fun createProjectType(
        externalAppEventResolutionRequest: ExternalAppEventResolutionRequest
    ): CompletableFuture<AppEventResolutionResponse> =
        createProjectType(externalAppEventResolutionRequest, RequestOptions.none())

    /**
     * A view of [TimelineServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TimelineServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /integrators/timeline/2026-03/events`, but is
         * otherwise the same as [TimelineServiceAsync.createEvent].
         */
        fun createEvent(params: TimelineCreateEventParams): CompletableFuture<HttpResponse> =
            createEvent(params, RequestOptions.none())

        /** @see createEvent */
        fun createEvent(
            params: TimelineCreateEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createEvent */
        fun createEvent(
            appEventOccurrence: AppEventOccurrence,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createEvent(
                TimelineCreateEventParams.builder().appEventOccurrence(appEventOccurrence).build(),
                requestOptions,
            )

        /** @see createEvent */
        fun createEvent(appEventOccurrence: AppEventOccurrence): CompletableFuture<HttpResponse> =
            createEvent(appEventOccurrence, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /integrators/timeline/2026-03/types/projects`, but
         * is otherwise the same as [TimelineServiceAsync.createProjectType].
         */
        fun createProjectType(
            params: TimelineCreateProjectTypeParams
        ): CompletableFuture<HttpResponseFor<AppEventResolutionResponse>> =
            createProjectType(params, RequestOptions.none())

        /** @see createProjectType */
        fun createProjectType(
            params: TimelineCreateProjectTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppEventResolutionResponse>>

        /** @see createProjectType */
        fun createProjectType(
            externalAppEventResolutionRequest: ExternalAppEventResolutionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppEventResolutionResponse>> =
            createProjectType(
                TimelineCreateProjectTypeParams.builder()
                    .externalAppEventResolutionRequest(externalAppEventResolutionRequest)
                    .build(),
                requestOptions,
            )

        /** @see createProjectType */
        fun createProjectType(
            externalAppEventResolutionRequest: ExternalAppEventResolutionRequest
        ): CompletableFuture<HttpResponseFor<AppEventResolutionResponse>> =
            createProjectType(externalAppEventResolutionRequest, RequestOptions.none())
    }
}
