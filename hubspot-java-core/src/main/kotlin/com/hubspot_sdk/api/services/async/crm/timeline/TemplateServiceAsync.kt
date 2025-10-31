// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.timeline

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.timeline.CollectionResponseTimelineEventTemplateNoPaging
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplate
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateCreateParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateDeleteParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateGetParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateListParams
import com.hubspot_sdk.api.models.crm.timeline.templates.TemplateUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateServiceAsync

    /**
     * Event templates define the general structure for a custom timeline event, and enable you to
     * send event data to HubSpot. A template includes formatted copy for its heading and details,
     * as well as any custom property definitions. A single app can include up to 750 event
     * templates.<br/><Warning>the `v1` and `v3` timeline events APIs are only available for app
     * partners with existing `v1`/`v3` timeline events defined in their public app. <ul><li>If your
     * app doesn't include any timeline events yet, requests to this endpoint will fail. Instead,
     * you can get started on
     * [latest version of the developer platform](/apps/developer-platform/build-apps/overview).
     * Note that you'll need to request approval before you can define app events for your app.
     * Learn more in the
     * [app events overview](/apps/developer-platform/add-features/app-events/overview).</li><li>If
     * your app includes a `v1`/`v3` timeline event, learn how to
     * [migrate it to the developer platform](/apps/developer-platform/add-features/app-events/create-and-manage-event-types#migrate-an-existing-timeline-event-type).
     * You don't need to request approval before migrating existing event types.</li></ul>If you're
     * not an app partner, you can send custom event data to HubSpot using the
     * [custom events API](/api-reference/events-manage-event-definitions-v3/guide).</Warning>
     */
    fun create(appId: Int, params: TemplateCreateParams): CompletableFuture<TimelineEventTemplate> =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventTemplate> =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: TemplateCreateParams): CompletableFuture<TimelineEventTemplate> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventTemplate>

    /** Update an existing event template, specified by ID. */
    fun update(
        eventTemplateId: String,
        params: TemplateUpdateParams,
    ): CompletableFuture<TimelineEventTemplate> =
        update(eventTemplateId, params, RequestOptions.none())

    /** @see update */
    fun update(
        eventTemplateId: String,
        params: TemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventTemplate> =
        update(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

    /** @see update */
    fun update(params: TemplateUpdateParams): CompletableFuture<TimelineEventTemplate> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventTemplate>

    /** Retrieve all templates defined for an app. */
    fun list(appId: Int): CompletableFuture<CollectionResponseTimelineEventTemplateNoPaging> =
        list(appId, TemplateListParams.none())

    /** @see list */
    fun list(
        appId: Int,
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseTimelineEventTemplateNoPaging> =
        list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(
        appId: Int,
        params: TemplateListParams = TemplateListParams.none(),
    ): CompletableFuture<CollectionResponseTimelineEventTemplateNoPaging> =
        list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseTimelineEventTemplateNoPaging>

    /** @see list */
    fun list(
        params: TemplateListParams
    ): CompletableFuture<CollectionResponseTimelineEventTemplateNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseTimelineEventTemplateNoPaging> =
        list(appId, TemplateListParams.none(), requestOptions)

    /** Delete an event type template by ID. */
    fun delete(eventTemplateId: String, params: TemplateDeleteParams): CompletableFuture<Void?> =
        delete(eventTemplateId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        eventTemplateId: String,
        params: TemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

    /** @see delete */
    fun delete(params: TemplateDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Retrieve an event type template by ID. */
    fun get(
        eventTemplateId: String,
        params: TemplateGetParams,
    ): CompletableFuture<TimelineEventTemplate> =
        get(eventTemplateId, params, RequestOptions.none())

    /** @see get */
    fun get(
        eventTemplateId: String,
        params: TemplateGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventTemplate> =
        get(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

    /** @see get */
    fun get(params: TemplateGetParams): CompletableFuture<TimelineEventTemplate> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TemplateGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventTemplate>

    /**
     * A view of [TemplateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /integrators/timeline/v3/{appId}/event-templates`,
         * but is otherwise the same as [TemplateServiceAsync.create].
         */
        fun create(
            appId: Int,
            params: TemplateCreateParams,
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        fun create(
            appId: Int,
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        fun create(
            params: TemplateCreateParams
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>>

        /**
         * Returns a raw HTTP response for `put
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}`, but is otherwise the
         * same as [TemplateServiceAsync.update].
         */
        fun update(
            eventTemplateId: String,
            params: TemplateUpdateParams,
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>> =
            update(eventTemplateId, params, RequestOptions.none())

        /** @see update */
        fun update(
            eventTemplateId: String,
            params: TemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>> =
            update(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

        /** @see update */
        fun update(
            params: TemplateUpdateParams
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>>

        /**
         * Returns a raw HTTP response for `get /integrators/timeline/v3/{appId}/event-templates`,
         * but is otherwise the same as [TemplateServiceAsync.list].
         */
        fun list(
            appId: Int
        ): CompletableFuture<HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging>> =
            list(appId, TemplateListParams.none())

        /** @see list */
        fun list(
            appId: Int,
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging>> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        fun list(
            appId: Int,
            params: TemplateListParams = TemplateListParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging>> =
            list(appId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging>>

        /** @see list */
        fun list(
            params: TemplateListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseTimelineEventTemplateNoPaging>> =
            list(appId, TemplateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}`, but is otherwise the
         * same as [TemplateServiceAsync.delete].
         */
        fun delete(
            eventTemplateId: String,
            params: TemplateDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(eventTemplateId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            eventTemplateId: String,
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

        /** @see delete */
        fun delete(params: TemplateDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}`, but is otherwise the
         * same as [TemplateServiceAsync.get].
         */
        fun get(
            eventTemplateId: String,
            params: TemplateGetParams,
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>> =
            get(eventTemplateId, params, RequestOptions.none())

        /** @see get */
        fun get(
            eventTemplateId: String,
            params: TemplateGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>> =
            get(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

        /** @see get */
        fun get(
            params: TemplateGetParams
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TemplateGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplate>>
    }
}
