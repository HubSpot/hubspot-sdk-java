// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.marketing

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.marketing.emails.AggregateEmailStatistics
import com.hubspot.sdk.models.marketing.emails.CollectionResponseWithTotalEmailStatisticInterval
import com.hubspot.sdk.models.marketing.emails.CollectionResponseWithTotalPublicEmail
import com.hubspot.sdk.models.marketing.emails.CollectionResponseWithTotalPublicEmailVersion
import com.hubspot.sdk.models.marketing.emails.EmailCloneParams
import com.hubspot.sdk.models.marketing.emails.EmailCreateAbTestVariationParams
import com.hubspot.sdk.models.marketing.emails.EmailCreateParams
import com.hubspot.sdk.models.marketing.emails.EmailDeleteParams
import com.hubspot.sdk.models.marketing.emails.EmailGetAbTestVariationParams
import com.hubspot.sdk.models.marketing.emails.EmailGetDraftParams
import com.hubspot.sdk.models.marketing.emails.EmailGetHistogramParams
import com.hubspot.sdk.models.marketing.emails.EmailGetParams
import com.hubspot.sdk.models.marketing.emails.EmailGetRevisionParams
import com.hubspot.sdk.models.marketing.emails.EmailListPageAsync
import com.hubspot.sdk.models.marketing.emails.EmailListParams
import com.hubspot.sdk.models.marketing.emails.EmailListRevisionsPageAsync
import com.hubspot.sdk.models.marketing.emails.EmailListRevisionsParams
import com.hubspot.sdk.models.marketing.emails.EmailPublishParams
import com.hubspot.sdk.models.marketing.emails.EmailResetDraftParams
import com.hubspot.sdk.models.marketing.emails.EmailRestoreRevisionParams
import com.hubspot.sdk.models.marketing.emails.EmailRestoreRevisionToDraftParams
import com.hubspot.sdk.models.marketing.emails.EmailUnpublishParams
import com.hubspot.sdk.models.marketing.emails.EmailUpdateDraftParams
import com.hubspot.sdk.models.marketing.emails.EmailUpdateParams
import com.hubspot.sdk.models.marketing.emails.PublicEmail
import com.hubspot.sdk.models.marketing.emails.PublicEmailVersion
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EmailServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailServiceAsync {

    private val withRawResponse: EmailServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailServiceAsync =
        EmailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // post /marketing/emails/2026-03
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EmailUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // patch /marketing/emails/2026-03/{emailId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EmailListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailListPageAsync> =
        // get /marketing/emails/2026-03
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EmailDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /marketing/emails/2026-03/{emailId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun clone(
        params: EmailCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // post /marketing/emails/2026-03/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    override fun createAbTestVariation(
        params: EmailCreateAbTestVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // post /marketing/emails/2026-03/ab-test/create-variation
        withRawResponse().createAbTestVariation(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: EmailGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AggregateEmailStatistics> =
        // get /marketing/emails/2026-03/statistics/list
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getAbTestVariation(
        params: EmailGetAbTestVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // get /marketing/emails/2026-03/{emailId}/ab-test/get-variation
        withRawResponse().getAbTestVariation(params, requestOptions).thenApply { it.parse() }

    override fun getDraft(
        params: EmailGetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // get /marketing/emails/2026-03/{emailId}/draft
        withRawResponse().getDraft(params, requestOptions).thenApply { it.parse() }

    override fun getHistogram(
        params: EmailGetHistogramParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalEmailStatisticInterval> =
        // get /marketing/emails/2026-03/statistics/histogram
        withRawResponse().getHistogram(params, requestOptions).thenApply { it.parse() }

    override fun getRevision(
        params: EmailGetRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmailVersion> =
        // get /marketing/emails/2026-03/{emailId}/revisions/{revisionId}
        withRawResponse().getRevision(params, requestOptions).thenApply { it.parse() }

    override fun listRevisions(
        params: EmailListRevisionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailListRevisionsPageAsync> =
        // get /marketing/emails/2026-03/{emailId}/revisions
        withRawResponse().listRevisions(params, requestOptions).thenApply { it.parse() }

    override fun publish(
        params: EmailPublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /marketing/emails/2026-03/{emailId}/publish
        withRawResponse().publish(params, requestOptions).thenAccept {}

    override fun resetDraft(
        params: EmailResetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /marketing/emails/2026-03/{emailId}/draft/reset
        withRawResponse().resetDraft(params, requestOptions).thenAccept {}

    override fun restoreRevision(
        params: EmailRestoreRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /marketing/emails/2026-03/{emailId}/revisions/{revisionId}/restore
        withRawResponse().restoreRevision(params, requestOptions).thenAccept {}

    override fun restoreRevisionToDraft(
        params: EmailRestoreRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // post /marketing/emails/2026-03/{emailId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreRevisionToDraft(params, requestOptions).thenApply { it.parse() }

    override fun unpublish(
        params: EmailUnpublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /marketing/emails/2026-03/{emailId}/unpublish
        withRawResponse().unpublish(params, requestOptions).thenAccept {}

    override fun updateDraft(
        params: EmailUpdateDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // patch /marketing/emails/2026-03/{emailId}/draft
        withRawResponse().updateDraft(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailServiceAsync.WithRawResponse =
            EmailServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun create(
            params: EmailCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun update(
            params: EmailUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionResponseWithTotalPublicEmail> =
            jsonHandler<CollectionResponseWithTotalPublicEmail>(clientOptions.jsonMapper)

        override fun list(
            params: EmailListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                EmailListPageAsync.builder()
                                    .service(EmailServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EmailDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val cloneHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun clone(
            params: EmailCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03", "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cloneHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createAbTestVariationHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun createAbTestVariation(
            params: EmailCreateAbTestVariationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        "ab-test",
                        "create-variation",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createAbTestVariationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<AggregateEmailStatistics> =
            jsonHandler<AggregateEmailStatistics>(clientOptions.jsonMapper)

        override fun get(
            params: EmailGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregateEmailStatistics>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03", "statistics", "list")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getAbTestVariationHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun getAbTestVariation(
            params: EmailGetAbTestVariationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "ab-test",
                        "get-variation",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAbTestVariationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getDraftHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun getDraft(
            params: EmailGetDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "draft",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHistogramHandler:
            Handler<CollectionResponseWithTotalEmailStatisticInterval> =
            jsonHandler<CollectionResponseWithTotalEmailStatisticInterval>(clientOptions.jsonMapper)

        override fun getHistogram(
            params: EmailGetHistogramParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalEmailStatisticInterval>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03", "statistics", "histogram")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHistogramHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getRevisionHandler: Handler<PublicEmailVersion> =
            jsonHandler<PublicEmailVersion>(clientOptions.jsonMapper)

        override fun getRevision(
            params: EmailGetRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmailVersion>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listRevisionsHandler: Handler<CollectionResponseWithTotalPublicEmailVersion> =
            jsonHandler<CollectionResponseWithTotalPublicEmailVersion>(clientOptions.jsonMapper)

        override fun listRevisions(
            params: EmailListRevisionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailListRevisionsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "revisions",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listRevisionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                EmailListRevisionsPageAsync.builder()
                                    .service(EmailServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val publishHandler: Handler<Void?> = emptyHandler()

        override fun publish(
            params: EmailPublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "publish",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { publishHandler.handle(it) }
                    }
                }
        }

        private val resetDraftHandler: Handler<Void?> = emptyHandler()

        override fun resetDraft(
            params: EmailResetDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "draft",
                        "reset",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { resetDraftHandler.handle(it) }
                    }
                }
        }

        private val restoreRevisionHandler: Handler<Void?> = emptyHandler()

        override fun restoreRevision(
            params: EmailRestoreRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { restoreRevisionHandler.handle(it) }
                    }
                }
        }

        private val restoreRevisionToDraftHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun restoreRevisionToDraft(
            params: EmailRestoreRevisionToDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore-to-draft",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { restoreRevisionToDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unpublishHandler: Handler<Void?> = emptyHandler()

        override fun unpublish(
            params: EmailUnpublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "unpublish",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { unpublishHandler.handle(it) }
                    }
                }
        }

        private val updateDraftHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: EmailUpdateDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "draft",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
