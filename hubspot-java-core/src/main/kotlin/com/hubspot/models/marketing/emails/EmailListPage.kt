// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.hubspot.core.AutoPager
import com.hubspot.core.Page
import com.hubspot.core.checkRequired
import com.hubspot.models.Paging
import com.hubspot.services.blocking.marketing.EmailService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EmailService.list */
class EmailListPage
private constructor(
    private val service: EmailService,
    private val params: EmailListParams,
    private val response: CollectionResponseWithTotalPublicEmail,
) : Page<PublicEmail> {

    /**
     * Delegates to [CollectionResponseWithTotalPublicEmail], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPublicEmail.results
     */
    fun results(): List<PublicEmail> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalPublicEmail], but gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalPublicEmail.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<PublicEmail> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): EmailListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): EmailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicEmail> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalPublicEmail = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailListPage]. */
    class Builder internal constructor() {

        private var service: EmailService? = null
        private var params: EmailListParams? = null
        private var response: CollectionResponseWithTotalPublicEmail? = null

        @JvmSynthetic
        internal fun from(emailListPage: EmailListPage) = apply {
            service = emailListPage.service
            params = emailListPage.params
            response = emailListPage.response
        }

        fun service(service: EmailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalPublicEmail) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EmailListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailListPage =
            EmailListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "EmailListPage{service=$service, params=$params, response=$response}"
}
